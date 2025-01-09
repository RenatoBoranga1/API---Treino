package com.empresa.apiTreino.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.apiTreino.exception.ResourceNotFoundException;
import com.empresa.apiTreino.model.Professor;
import com.empresa.apiTreino.repository.ProfessorRepository;

@Service
public class ProfessorServiceImpl implements ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    @Override
    public List<Professor> getAllProfessores() {
        return professorRepository.findAll();
    }

    @Override
    public Professor getProfessorById(Long id) {
        Optional<Professor> optionalProfessor = professorRepository.findById(id);
        return optionalProfessor.orElseThrow(() -> new ResourceNotFoundException("Professor não encontrado"));
    }

    @Override
    public Professor createProfessor(Professor professor) {
        return professorRepository.save(professor);
    }

    @Override
    public Professor updateProfessor(Long id, Professor professor) {
        Professor existingProfessor = getProfessorById(id);
        existingProfessor.setNome(professor.getNome());
        return professorRepository.save(existingProfessor);
    }

    @Override
    public void deleteProfessor(Long id) {
        Professor existingProfessor = getProfessorById(id);
        professorRepository.delete(existingProfessor);
    }
}
