package com.empresa.apiTreino.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.empresa.apiTreino.model.Plano;
import com.empresa.apiTreino.service.PlanoService;

import java.util.List;

@RestController
@RequestMapping("/planos")
public class PlanoController {

    @Autowired
    private PlanoService planoService;

    @GetMapping
    public List<Plano> getAllPlanos() {
        return planoService.getAllPlanos();
    }

    @GetMapping("/{id}")
    public Plano getPlanoById(@PathVariable Long id) {
        return planoService.getPlanoById(id);
    }

    @PostMapping
    public Plano createPlano(@RequestBody Plano plano) {
        return planoService.createPlano(plano);
    }

    @PutMapping("/{id}")
    public Plano updatePlano(@PathVariable Long id, @RequestBody Plano plano) {
        return planoService.updatePlano(id, plano);
    }

    @DeleteMapping("/{id}")
    public void deletePlano(@PathVariable Long id) {
        planoService.deletePlano(id);
    }
}
