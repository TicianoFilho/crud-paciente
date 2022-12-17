package br.com.mv.estagio.cubo.crudpaciente.services;

import java.util.List;

import org.springframework.data.domain.Page;

import br.com.mv.estagio.cubo.crudpaciente.domain.Role;
import br.com.mv.estagio.cubo.crudpaciente.domain.Usuario;

public interface UsuarioService {

	Usuario saveUsuario(Usuario usuario);
	Role saveRole(Role role);
	void addRoleToUsuario(String email, String roleDescricao);
	Usuario getUsuario(String email);
	List<Usuario> getUsuarios(Page<Usuario> page);
}
