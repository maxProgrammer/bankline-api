package com.api.santander.banklineapi.service;

import com.api.santander.banklineapi.dto.CorrentistaDto;
import com.api.santander.banklineapi.model.Conta;
import com.api.santander.banklineapi.model.Correntista;
import com.api.santander.banklineapi.repository.CorrentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CorrentistaService {
    @Autowired
    private CorrentistaRepository repository;
    public void save(CorrentistaDto correntistaDto){
        Correntista correntista = new Correntista();
        correntista.setCpf(correntistaDto.getCpf());
        correntista.setNome(correntistaDto.getNome());

        Conta conta = new Conta();
        conta.setSaldo(0.0);
        conta.setNumero(new Date().getTime());

        correntista.setConta(conta);
        repository.save(correntista);
    }
}
