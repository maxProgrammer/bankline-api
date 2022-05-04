package com.api.santander.banklineapi.repository;

import com.api.santander.banklineapi.model.Correntista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorrentistaRepository extends JpaRepository<Correntista,Integer> {
}
