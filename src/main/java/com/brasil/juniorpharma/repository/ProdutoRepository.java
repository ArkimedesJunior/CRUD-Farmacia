package com.brasil.juniorpharma.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import com.brasil.juniorpharma.model.Produto;

public interface ProdutoRepository  extends JpaRepository<Produto, Long> {
	
	


}