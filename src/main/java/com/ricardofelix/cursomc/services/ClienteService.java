package com.ricardofelix.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ricardofelix.cursomc.domain.Categoria;
import com.ricardofelix.cursomc.domain.Cliente;
import com.ricardofelix.cursomc.repositories.ClienteRepository;
import com.ricardofelix.cursomc.services.exception.ObjectNotFoundException;

@Service
public class ClienteService {

	
	@Autowired
	ClienteRepository clienteRepository;
	
	public Cliente buscarById (Integer id) {
		Optional<Cliente> cliente = clienteRepository.findById(id);
		
		return cliente.orElseThrow( () -> new ObjectNotFoundException("Objeto não encontrado id: "+id+ " Nome: "+ Cliente.class.getName()) );
	}
	
}
