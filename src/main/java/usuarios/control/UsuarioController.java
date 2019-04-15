package usuarios.control;

import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import usuarios.entity.Usuario;
import usuarios.repository.UsuarioRepository;

@RestController
public class UsuarioController {
	private UsuarioRepository usuarioRepository;

	public UsuarioController(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	@PostMapping("/usuario/")
	public Usuario createUsuario(@RequestBody Usuario request) {
		return usuarioRepository.save(request);
	}

	@GetMapping("/usuario/{id}/")
	public ResponseEntity<Usuario> getUser(@PathVariable("id") Long id) {
		Optional<Usuario> maybeUser = usuarioRepository.findById(id);
		if (!maybeUser.isPresent()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(maybeUser.get(), HttpStatus.OK);
	}
	
	@GetMapping("/usuario/list/")
    public ResponseEntity<Iterable<Usuario>> listAllUsers() {
        Iterable<Usuario> users = usuarioRepository.findAll();
        return new ResponseEntity<Iterable<Usuario>>(users, HttpStatus.OK);
    }
}
