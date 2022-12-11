package br.com.mv.estagio.cubo.crudpaciente.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mv.estagio.cubo.crudpaciente.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID>{

}
