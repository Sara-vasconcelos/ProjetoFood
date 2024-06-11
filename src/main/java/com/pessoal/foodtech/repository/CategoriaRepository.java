package com.pessoal.foodtech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.pessoal.foodtech.model.CategoriaModel;



public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {

	
	public List <CategoriaModel> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
}
