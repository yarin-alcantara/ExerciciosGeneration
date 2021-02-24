package com.gameshow.MinhaLojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gameshow.MinhaLojaDeGames.Model.CategoriaModel;

public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {
	public List<CategoriaModel> findAllByCategoriaContainingIgnoreCase(String Categoria);

}
