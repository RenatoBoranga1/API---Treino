package com.empresa.apiTreino.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.apiTreino.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // O Spring Data JPA já fornece o método `existsById` e `findById`
}
