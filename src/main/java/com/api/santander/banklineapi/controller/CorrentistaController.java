package com.api.santander.banklineapi.controller;

import com.api.santander.banklineapi.dto.CorrentistaDto;
import com.api.santander.banklineapi.model.Correntista;
import com.api.santander.banklineapi.repository.CorrentistaRepository;
import com.api.santander.banklineapi.service.CorrentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {

    @Autowired
    private CorrentistaRepository repository;

    @Autowired
    private CorrentistaService service;

    @GetMapping
    public List<Correntista> findAll(){
        return repository.findAll();
    }

    @PostMapping
    public void save(@RequestBody CorrentistaDto correntista){
        service.save(correntista);


    }
}
