package br.com.mv.estagio.cubo.crudpaciente;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.mv.estagio.cubo.crudpaciente.domain.Role;
import br.com.mv.estagio.cubo.crudpaciente.domain.Usuario;
import br.com.mv.estagio.cubo.crudpaciente.enums.RoleEnum;
import br.com.mv.estagio.cubo.crudpaciente.services.UsuarioService;

@SpringBootApplication
public class CrudPacienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudPacienteApplication.class, args);
	}
	
	@Bean
	CommandLineRunner run(UsuarioService usuarioService) {
		return args -> {
			
			// Insert role in the database
			usuarioService.saveRole(new Role(null, "ROLE_ADMIN"));
			usuarioService.saveRole(new Role(null, "ROLE_USER"));
			
			// Insert user in the database
			Usuario usuario1 = new Usuario(null, "ticiano", "ticiano.filho@mv.com.br", "abc123", new ArrayList<>());
			Usuario usuario2 = new Usuario(null, "Theo", "theo.braz@mv.com.br", "123abc", new ArrayList<>());
			usuarioService.saveUsuario(usuario1);
			usuarioService.saveUsuario(usuario2);
			
			// Add roles to user
			usuarioService.addRoleToUsuario("ticiano.filho@mv.com.br", "ROLE_USER");
			usuarioService.addRoleToUsuario("theo.braz@mv.com.br", "ROLE_USER");
			usuarioService.addRoleToUsuario("theo.braz@mv.com.br", "ROLE_ADMIN");
			
		};
	}

}
