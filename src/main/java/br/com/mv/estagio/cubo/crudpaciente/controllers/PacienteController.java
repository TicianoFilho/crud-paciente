package br.com.mv.estagio.cubo.crudpaciente.controllers;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/pacientes")
public class PacienteController {

	@GetMapping
	public ResponseEntity<Object> getAll() {
		return ResponseEntity.status(HttpStatus.OK).body(new ArrayList<>());
	}
}
