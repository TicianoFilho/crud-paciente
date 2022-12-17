package br.com.mv.estagio.cubo.crudpaciente.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.mv.estagio.cubo.crudpaciente.domain.Usuario;
import br.com.mv.estagio.cubo.crudpaciente.dtos.RoleToUserDto;
import br.com.mv.estagio.cubo.crudpaciente.services.UsuarioService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UsuarioController {

	private final UsuarioService usuarioService;
	
	@GetMapping("/usuarios")
	public ResponseEntity<List<Usuario>> getUsuarios() {
		return ResponseEntity.ok().body(usuarioService.getUsuarios());
	}
	
	@PostMapping("/usuarios")
	public ResponseEntity<Usuario> saveUsuario(@RequestBody Usuario usuario) {
		URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/usuarios").toUriString());
		return ResponseEntity.created(uri).body(usuarioService.saveUsuario(usuario));
	}
}
