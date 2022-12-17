package br.com.mv.estagio.cubo.crudpaciente.services.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.mv.estagio.cubo.crudpaciente.domain.Role;
import br.com.mv.estagio.cubo.crudpaciente.domain.Usuario;
import br.com.mv.estagio.cubo.crudpaciente.repositories.RoleRepository;
import br.com.mv.estagio.cubo.crudpaciente.repositories.UsuarioRepository;
import br.com.mv.estagio.cubo.crudpaciente.services.UsuarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UsuarioServiceImpl implements UsuarioService {

	private final UsuarioRepository usuarioRepository;
	private final RoleRepository roleRepository;

	@Override
	public Usuario saveUsuario(Usuario usuario) {
		log.info("saving usuario {} to the database", usuario.getNome());
		return usuarioRepository.save(usuario);
	}

	@Override
	public Role saveRole(Role role) {
		log.info("saving role {} to the database", role.getDescricao());
		return roleRepository.save(role);
	}

	@Override
	public void addRoleToUsuario(String email, String roleDescricao) {
		log.info("Adding role {} to the user {}", roleDescricao, email);
		Usuario usuario = usuarioRepository.findByEmail(email);
		Role role = roleRepository.findByDescricao(roleDescricao);
		usuario.getRoles().add(role);
	}

	@Override
	public Usuario getUsuario(String email) {
		log.info("fetching user {}", email);
		return usuarioRepository.findByEmail(email);
	}

	@Override
	public List<Usuario> getUsuarios(Page<Usuario> page) {
		log.info("fetching all users");
		return usuarioRepository.findAll();
	}


}
