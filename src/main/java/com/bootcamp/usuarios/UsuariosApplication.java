package com.bootcamp.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.hateoas.config.EnableEntityLinks;

@EntityScan({"com.bootcamp.usuarioscommons.model.entity"})
@SpringBootApplication
//@EnableZipkinServer
@EnableEntityLinks
public class UsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsuariosApplication.class, args);
	}

}
