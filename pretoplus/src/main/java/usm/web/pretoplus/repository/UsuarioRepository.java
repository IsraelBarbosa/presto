
package usm.web.pretoplus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import usm.web.pretoplus.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String>{
	Usuario findByLogin(String login);

	
}
