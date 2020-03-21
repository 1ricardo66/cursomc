package com.ricardofelix.cursomc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ricardofelix.cursomc.domain.Categoria;
import com.ricardofelix.cursomc.repositories.CategoriaRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{
	
	@Autowired
	CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Categoria c1 = new Categoria(null,"Informática");
		Categoria c2 = new Categoria(null,"Escritório");
		Categoria c3 = new Categoria(null,"Farmácia");
		Categoria c4 = new Categoria(null,"Escola");
		Categoria c5 = new Categoria(null,"TI");
		
		List<Categoria> categoria = new ArrayList<>();
		
		categoria.add(c1);
		categoria.add(c2);
		categoriaRepository.saveAll(Arrays.asList(c1,c2,c3,c4,c5));
		
	}

}
