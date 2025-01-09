package com.empresa.apiTreino.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.empresa.apiTreino.model.Treino;
import com.empresa.apiTreino.service.TreinoService;

import java.util.List;

@RestController
@RequestMapping("/treinos")
public class TreinoController {

    @Autowired
    private TreinoService treinoService;

    @GetMapping
    public List<Treino> getAllTreinos() {
        return treinoService.getAllTreinos();
    }

    @GetMapping("/{id}")
    public Treino getTreinoById(@PathVariable Long id) {
        return treinoService.getTreinoById(id);
    }

    @PostMapping
    public Treino createTreino(@RequestBody Treino treino) {
        return treinoService.createTreino(treino);
    }

    @PutMapping("/{id}")
    public Treino updateTreino(@PathVariable Long id, @RequestBody Treino treino) {
        return treinoService.updateTreino(id, treino);
    }

    @DeleteMapping("/{id}")
    public void deleteTreino(@PathVariable Long id) {
        treinoService.deleteTreino(id);
    }
}
