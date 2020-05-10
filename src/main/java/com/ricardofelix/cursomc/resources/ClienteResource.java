package com.ricardofelix.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ricardofelix.cursomc.domain.Cliente;
import com.ricardofelix.cursomc.services.ClienteService;

@RestController
@RequestMapping(value="/clientes")
public class ClienteResource {

	
	@Autowired 
	ClienteService clienteService;
	
	@GetMapping("/{id}")
	public Cliente buscarById(@PathVariable Integer id) {
		
		return clienteService.buscarById(id);
	}
}
