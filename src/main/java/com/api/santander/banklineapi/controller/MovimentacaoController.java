package com.api.santander.banklineapi.controller;

import com.api.santander.banklineapi.dto.MovimentacaoDto;
import com.api.santander.banklineapi.model.Movimentacao;
import com.api.santander.banklineapi.repository.MovimentacaoRepository;
import com.api.santander.banklineapi.service.MovimentacaoService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
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
    @Operation(summary = "List all operations")
    public List<Movimentacao> findAll(){
        return repository.findAll();
    }

    @GetMapping("/{idConta}")
    @Operation(summary = "List all operatins by  idConta")
    public List<Movimentacao> findAll(@PathVariable("idConta") Integer idConta){
        return repository.findByIdConta(idConta);
    }

    @PostMapping
    @Operation(summary = "Add an operation")
    public void save(@RequestBody MovimentacaoDto movimentacao){
        service.save(movimentacao);
    }

}
