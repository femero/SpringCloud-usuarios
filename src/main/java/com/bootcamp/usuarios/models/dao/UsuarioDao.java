package com.bootcamp.usuarios.models.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.RequestParam;

import com.bootcamp.usuarioscommons.model.entity.Usuario;

@RepositoryRestResource(path = "usuarios")
public interface UsuarioDao extends PagingAndSortingRepository<Usuario, Long> {

	@RestResource(path = "buscar")
	Optional<Usuario> findByUsername(@RequestParam("username") String username);

	@Query("select u from Usuario u where u.username=?1")
	Optional<Usuario> obtenerPorUsername(String username);
}
