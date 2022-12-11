package br.com.mv.estagio.cubo.crudpaciente.services;

import java.util.List;

import org.springframework.data.domain.Page;

import br.com.mv.estagio.cubo.crudpaciente.entities.Usuario;

public interface UsuarioService {

	Usuario saveUsuario(Usuario usuario);
	void saveRoleParaUsuario(String email, String roleDescricao);
	Usuario getUsuario(String email);
	List<Usuario> getUsuarios(Page<Usuario> page);
}
