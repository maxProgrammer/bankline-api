package com.api.santander.banklineapi.service;

import com.api.santander.banklineapi.dto.MovimentacaoDto;
import com.api.santander.banklineapi.model.Correntista;
import com.api.santander.banklineapi.model.Movimentacao;
import com.api.santander.banklineapi.model.MovimentacaoTipo;
import com.api.santander.banklineapi.repository.CorrentistaRepository;
import com.api.santander.banklineapi.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class MovimentacaoService {
    @Autowired
    private MovimentacaoRepository repository;

    @Autowired
    private CorrentistaRepository correntistaRepository;
    public void save(MovimentacaoDto movimentacaoDto){
        Movimentacao movimentacao = new Movimentacao();
        Double valor = movimentacaoDto.getTipo() == MovimentacaoTipo.RECEITA ? movimentacaoDto.getValor()
                : movimentacaoDto.getValor() * -1;
        movimentacao.setDataHora(LocalDateTime.now());
        movimentacao.setDescricao(movimentacaoDto.getDescricao());
        movimentacao.setIdConta(movimentacaoDto.getIdConta());
        movimentacao.setTipo(movimentacaoDto.getTipo());
        movimentacao.setValor(valor);

        Correntista correntista = correntistaRepository.findById(movimentacaoDto.getIdConta()).orElse(null);
        if(correntista != null){
            correntista.getConta().setSaldo(correntista.getConta().getSaldo() + valor);
            correntistaRepository.save(correntista);
        }

        repository.save(movimentacao);
    }
}
