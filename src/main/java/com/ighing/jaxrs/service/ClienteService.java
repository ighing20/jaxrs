package com.ighing.jaxrs.service;

import java.util.List;

import com.ighing.jaxrs.entity.Cliente;
import com.ighing.jaxrs.repository.ClienteRepository;

public class ClienteService {

	ClienteRepository repository = ClienteRepository.getInstance();

	public String crearCliente(Cliente cliente) {
		repository.create(cliente);
		String mensaje = "Ya se ingreso al cliente " + cliente.getNombre() + " con su numero " + cliente.getTelefono()
				+ " y direccion " + cliente.getDireccion() + ".";
		return mensaje;
	}
	public List<Cliente> consultarCliente() {
		return repository.all();
	}
}
