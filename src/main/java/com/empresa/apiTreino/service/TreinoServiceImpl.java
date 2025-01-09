package com.empresa.apiTreino.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.apiTreino.exception.ResourceNotFoundException;
import com.empresa.apiTreino.model.Treino;
import com.empresa.apiTreino.repository.TreinoRepository;

@Service
public class TreinoServiceImpl implements TreinoService {

    @Autowired
    private TreinoRepository treinoRepository;

    @Override
    public List<Treino> getAllTreinos() {
        return treinoRepository.findAll();
    }

    @Override
    public Treino getTreinoById(Long id) {
        Optional<Treino> optionalTreino = treinoRepository.findById(id);
        return optionalTreino.orElseThrow(() -> new ResourceNotFoundException("Treino não encontrado"));
    }

    @Override
    public Treino createTreino(Treino treino) {
        return treinoRepository.save(treino);
    }

    @Override
    public Treino updateTreino(Long id, Treino treino) {
        Treino existingTreino = getTreinoById(id);
        existingTreino.setDescricao(treino.getDescricao());
        existingTreino.setData(treino.getData());
        return treinoRepository.save(existingTreino);
    }

    @Override
    public void deleteTreino(Long id) {
        Treino existingTreino = getTreinoById(id);
        treinoRepository.delete(existingTreino);
    }
}