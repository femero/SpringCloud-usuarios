package com.bootcamp.usuarios;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.bootcamp.usuarioscommons.model.entity.Role;
import com.bootcamp.usuarioscommons.model.entity.Usuario;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer{

	private static final Logger LOG = Logger.getLogger(RepositoryConfig.class.getName());
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		LOG.log(Level.INFO, "calling home");
		config.exposeIdsFor(Usuario.class, Role.class);
	}
}
