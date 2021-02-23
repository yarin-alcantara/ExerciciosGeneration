package com.farmaon.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmaon.farmacia.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto> findAllByDetalhamentoContainingIgnoreCase(String Detalhamento);
}
