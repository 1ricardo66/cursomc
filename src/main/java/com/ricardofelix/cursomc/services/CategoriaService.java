package com.ricardofelix.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ricardofelix.cursomc.services.exception.ObjectNotFoundException;
import com.ricardofelix.cursomc.domain.Categoria;
import com.ricardofelix.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow( () -> new ObjectNotFoundException(
			"Objeto não encontrado id: "+id+ " Nome: "+ Categoria.class.getName()));
	
	}

}
