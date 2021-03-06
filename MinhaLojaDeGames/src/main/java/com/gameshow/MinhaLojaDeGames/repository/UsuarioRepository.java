package com.gameshow.MinhaLojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gameshow.MinhaLojaDeGames.Model.UsuarioModel;

@Repository
public interface UsuarioRepository extends JpaRepository <UsuarioModel, Long>{
	public List<UsuarioModel>findAllByNomeUsuarioContainingIgnoreCase(String nomeUsuario);

}
