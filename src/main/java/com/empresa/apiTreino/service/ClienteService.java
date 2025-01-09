package com.empresa.apiTreino.service;

import java.util.List;
import java.util.Optional;

import com.empresa.apiTreino.model.Cliente;

public interface ClienteService {

    List<Cliente> getAllClientes();

    
    Optional<Cliente> getClienteById(Long id);

    Cliente createCliente(Cliente cliente);

    Cliente updateCliente(Long id, Cliente cliente);

    void deleteCliente(Long id);

    boolean existsById(Long id);
}
