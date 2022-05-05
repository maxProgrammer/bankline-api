package com.api.santander.banklineapi.controller;

import com.api.santander.banklineapi.dto.MovimentacaoDto;
import com.api.santander.banklineapi.model.Movimentacao;
import com.api.santander.banklineapi.repository.MovimentacaoRepository;
import com.api.santander.banklineapi.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {

    @Autowired
    private MovimentacaoRepository repository;

    @Autowired
    private MovimentacaoService service;

    @GetMapping
    public List<Movimentacao> findAll(){
        return repository.findAll();
    }

    @PostMapping
    public void save(@RequestBody MovimentacaoDto movimentacao){
        service.save(movimentacao);


    }
}
