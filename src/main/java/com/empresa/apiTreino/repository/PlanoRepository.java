package com.empresa.apiTreino.repository;

import com.empresa.apiTreino.model.Plano;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanoRepository extends JpaRepository<Plano, Long> {
}
