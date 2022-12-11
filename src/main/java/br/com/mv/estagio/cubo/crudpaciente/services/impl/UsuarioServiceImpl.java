package br.com.mv.estagio.cubo.crudpaciente.services.impl;

import java.util.List;

import org.springframework.data.domain.Page;

import br.com.mv.estagio.cubo.crudpaciente.entities.Usuario;
import br.com.mv.estagio.cubo.crudpaciente.services.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {

	@Override
	public Usuario saveUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveRoleParaUsuario(String email, String roleDescricao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario getUsuario(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> getUsuarios(Page<Usuario> page) {
		// TODO Auto-generated method stub
		return null;
	}

}
