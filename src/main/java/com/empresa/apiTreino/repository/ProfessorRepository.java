package com.empresa.apiTreino.repository;

import com.empresa.apiTreino.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
