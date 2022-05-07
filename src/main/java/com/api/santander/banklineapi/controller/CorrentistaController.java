package com.api.santander.banklineapi.controller;

import com.api.santander.banklineapi.dto.CorrentistaDto;
import com.api.santander.banklineapi.model.Correntista;
import com.api.santander.banklineapi.repository.CorrentistaRepository;
import com.api.santander.banklineapi.service.CorrentistaService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/correntistas")
@OpenAPIDefinition(info = @Info(title = "Account API", version = "1.0", description = "REST API responsible to allow CRUD costumer/operations account."))
public class CorrentistaController {

    @Autowired
    private CorrentistaRepository repository;

    @Autowired
    private CorrentistaService service;

    @Operation(summary = "Return Costumer List")
    @GetMapping
    public List<Correntista> findAll(){
        return repository.findAll();
    }

    @Operation(summary = "Add a costumer")
    @PostMapping
    @Transactional
    public void save(@RequestBody CorrentistaDto correntista){
        service.save(correntista);


    }
}
