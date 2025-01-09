package com.empresa.apiTreino.service;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.anyLong;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

import com.empresa.apiTreino.exception.ResourceNotFoundException;
import com.empresa.apiTreino.model.Cliente;
import com.empresa.apiTreino.repository.ClienteRepository;

public class ClienteServiceImplTest {

    @Mock
    private ClienteRepository clienteRepository;

    @InjectMocks
    private ClienteServiceImpl clienteService;

    public ClienteServiceImplTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetClienteById_ClienteNotFound() {
        // Mockando que o cliente não foi encontrado
        when(clienteRepository.findById(anyLong())).thenReturn(Optional.empty());

        // Verificando se a exceção ResourceNotFoundException é lançada
        assertThrows(ResourceNotFoundException.class, () -> {
            clienteService.getClienteById(1L); // Esperando a exceção ser lançada
        });
    }

    @Test
    public void testGetClienteById_ClienteFound() {
        // Criando um cliente mockado
        Cliente cliente = new Cliente();
        cliente.setId(1L);

        // Mockando que o cliente foi encontrado
        when(clienteRepository.findById(anyLong())).thenReturn(Optional.of(cliente));

        // Agora, como getClienteById retorna Optional, usamos o get() ou orElse()
        Cliente foundCliente = clienteService.getClienteById(1L).orElseThrow();

        // Verificando se o cliente encontrado não é nulo e se o ID é o esperado
        assertNotNull(foundCliente);
        assertEquals(1L, foundCliente.getId());
    }
}
