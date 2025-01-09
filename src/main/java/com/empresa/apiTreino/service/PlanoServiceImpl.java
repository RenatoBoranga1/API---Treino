package com.empresa.apiTreino.service;

import com.empresa.apiTreino.exception.ResourceNotFoundException;
import com.empresa.apiTreino.model.Plano;
import com.empresa.apiTreino.repository.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PlanoServiceImpl implements PlanoService {

    @Autowired
    private PlanoRepository planoRepository;

    @Override
    public List<Plano> getAllPlanos() {
        return planoRepository.findAll();
    }

    @Override
    public Plano getPlanoById(Long id) {
        Optional<Plano> optionalPlano = planoRepository.findById(id);
        return optionalPlano.orElseThrow(() -> new ResourceNotFoundException("Plano não encontrado"));
    }

    @Override
    public Plano createPlano(Plano plano) {
        return planoRepository.save(plano);
    }

    @Override
    public Plano updatePlano(Long id, Plano plano) {
        Plano existingPlano = getPlanoById(id);
        existingPlano.setNomePlano(plano.getNomePlano());
        existingPlano.setNumeroDeTreinos(plano.getNumeroDeTreinos());
        return planoRepository.save(existingPlano);
    }

    @Override
    public void deletePlano(Long id) {
        Plano existingPlano = getPlanoById(id);
        planoRepository.delete(existingPlano);
    }
}
