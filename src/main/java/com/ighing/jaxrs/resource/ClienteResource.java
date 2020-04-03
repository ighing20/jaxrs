package com.ighing.jaxrs.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ighing.jaxrs.entity.Cliente;
import com.ighing.jaxrs.service.ClienteService;

@Path("clientes")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ClienteResource {
	
	private ClienteService service = new ClienteService();
	
	@POST
	public String crearCliente(Cliente cliente) {
		return service.crearCliente(cliente);
	}

	@GET
	public List<Cliente> consultarCliente() {
		return service.consultarCliente();
	}

}
