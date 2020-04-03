package com.ighing.jaxrs.service;

import java.util.List;

import com.ighing.jaxrs.entity.Cliente;
import com.ighing.jaxrs.repository.ClienteRepository;

public class ClienteService {

	ClienteRepository repository = ClienteRepository.getInstance();

	public void addCliente(Cliente cliente) {
		repository.create(cliente);
	}

	public List<Cliente> getAllCliente() {
		return repository.getAll();
	}

	public Cliente getCliente(int clienteId) {
		return repository.get(clienteId);
	}

	public Cliente updateCliente(Cliente cliente) {
		if (cliente.getId() <= 0)
			return null;
		return repository.update(cliente);
	}

	public Cliente removeCliente(int clienteId) {
		return repository.delete(clienteId);
	}

}
