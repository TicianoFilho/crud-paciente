package br.com.mv.estagio.cubo.crudpaciente.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mv.estagio.cubo.crudpaciente.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID>{

	Usuario findByEmail(String email);
}
