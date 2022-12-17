package br.com.mv.estagio.cubo.crudpaciente.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mv.estagio.cubo.crudpaciente.domain.Role;

public interface RoleRepository extends JpaRepository<Role, UUID> {

	Role findByDescricao(String descricao);
}
