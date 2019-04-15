package usuarios.repository;
import org.springframework.data.repository.CrudRepository;

import usuarios.entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>{

}
