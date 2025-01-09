package com.empresa.apiTreino.service;

import com.empresa.apiTreino.model.Professor;
import java.util.List;

public interface ProfessorService {
    List<Professor> getAllProfessores();
    Professor getProfessorById(Long id);
    Professor createProfessor(Professor professor);
    Professor updateProfessor(Long id, Professor professor);
    void deleteProfessor(Long id);
}
