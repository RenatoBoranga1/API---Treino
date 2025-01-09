package com.empresa.apiTreino.service;

import com.empresa.apiTreino.model.Plano;
import java.util.List;

public interface PlanoService {
    List<Plano> getAllPlanos();
    Plano getPlanoById(Long id);
    Plano createPlano(Plano plano);
    Plano updatePlano(Long id, Plano plano);
    void deletePlano(Long id);
}
