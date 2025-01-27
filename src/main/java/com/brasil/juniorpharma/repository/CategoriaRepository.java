package com.brasil.juniorpharma.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.brasil.juniorpharma.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	public List <Categoria> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
	
	public List <Categoria> findAllByPrecoContainingIgnoreCase(@Param("nome") String preco);
	
	public List <Categoria> findAllByCategoriaContainingIgnoreCase(@Param("nome") String categoria);
}
