package com.example.curso.service.impl;

import com.example.curso.domain.repository.Pedidos;
import com.example.curso.service.PedidoService;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {
    private Pedidos repository;

    public PedidoServiceImpl(Pedidos repository) {
        this.repository = repository;
    }
}
