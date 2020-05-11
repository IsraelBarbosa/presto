package usm.web.pretoplus.repository;

import org.springframework.data.repository.CrudRepository;

import usm.web.pretoplus.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String>{
	Usuario findByLogin(String login);
}
