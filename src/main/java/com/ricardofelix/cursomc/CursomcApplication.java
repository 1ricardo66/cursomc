package com.ricardofelix.cursomc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ricardofelix.cursomc.domain.Categoria;
import com.ricardofelix.cursomc.domain.Cidade;
import com.ricardofelix.cursomc.domain.Estado;
import com.ricardofelix.cursomc.domain.Produto;
import com.ricardofelix.cursomc.repositories.CategoriaRepository;
import com.ricardofelix.cursomc.repositories.CidadeRepository;
import com.ricardofelix.cursomc.repositories.EstadoRepository;
import com.ricardofelix.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@Autowired
	EstadoRepository estadoRepository;
	
	@Autowired
	CidadeRepository cidadeRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Categoria c1 = new Categoria(null,"Informática");
		Categoria c2 = new Categoria(null,"Escritório");
		
		
		List<Categoria> categoria = new ArrayList<>();
		
		Produto p1 = new Produto(null,"Computador",2000.00);
		Produto p2 = new Produto(null,"Impressora",800.00);
		Produto p3 = new Produto(null,"Mouse",80.00);

		c1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		c2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(c1));
		p2.getCategorias().addAll(Arrays.asList(c1,c2));
		p3.getCategorias().addAll(Arrays.asList(c1));
	
		
		categoriaRepository.saveAll(Arrays.asList(c1,c2));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
		
		Estado est1 = new Estado(null,"Goiás");
		Estado est2 = new Estado(null,"São Paulo");
		
		
		Cidade ci1 = new Cidade(null, "Santa Helena de goias",est1);
		Cidade ci2 = new Cidade(null, "São Paulo",est2);
		Cidade ci3 = new Cidade(null, "Rio verde",est1);

		est1.getCidades().addAll(Arrays.asList(ci1,ci3));
		est2.getCidades().addAll(Arrays.asList(ci2));
		
		
		estadoRepository.saveAll(Arrays.asList(est1,est2));
		
		cidadeRepository.saveAll(Arrays.asList(ci1,ci2,ci3));
	}

}
