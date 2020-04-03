package com.ighing.jaxrs.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ighing.jaxrs.entity.Cliente;

public class ClienteRepository {

	private static ClienteRepository instance = null;

	private Map<Integer, Cliente> map = new HashMap<>();

	private ClienteRepository() {

	}

	public static ClienteRepository getInstance() {
		if (instance == null) {
			instance = new ClienteRepository();
		}
		return instance;
	}

	public List<Cliente> getAll() {
		return new ArrayList<>(map.values());
	}

	public void create(Cliente cliente) {
		cliente.setId(map.size() + 1);
		map.put(cliente.getId(), cliente);
	}

	public Cliente get(int id) {
		return map.get(id);
	}
	
	public Cliente update(Cliente cliente) {
		return map.put(cliente.getId(), cliente); // upsert
	}

	public Cliente delete(int id) {
		return map.remove(id);
	}

}
