package com.empresa.apiTreino.repository;

import com.empresa.apiTreino.model.Treino;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreinoRepository extends JpaRepository<Treino, Long> {
}
