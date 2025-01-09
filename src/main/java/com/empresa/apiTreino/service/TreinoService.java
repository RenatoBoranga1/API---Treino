package com.empresa.apiTreino.service;

import com.empresa.apiTreino.model.Treino;
import java.util.List;

public interface TreinoService {
    List<Treino> getAllTreinos();
    Treino getTreinoById(Long id);
    Treino createTreino(Treino treino);
    Treino updateTreino(Long id, Treino treino);
    void deleteTreino(Long id);
}
