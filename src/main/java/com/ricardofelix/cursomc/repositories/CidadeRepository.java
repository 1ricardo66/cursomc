package com.ricardofelix.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardofelix.cursomc.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade,Integer>{

}
