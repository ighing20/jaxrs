package com.ighing.jaxrs.service;

import java.util.List;

import com.ighing.jaxrs.entity.Cliente;
import com.ighing.jaxrs.repository.ClienteRepository;

public class ClienteService {

	ClienteRepository repository = ClienteRepository.getInstance();

	public void crearCliente(Cliente cliente) {
		repository.create(cliente);
	}

	public List<Cliente> consultarCliente() {
		return repository.all();
	}
}
