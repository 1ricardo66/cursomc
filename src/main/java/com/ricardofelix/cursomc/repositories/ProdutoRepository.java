package com.ricardofelix.cursomc.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ricardofelix.cursomc.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Serializable> {
	
	

}
