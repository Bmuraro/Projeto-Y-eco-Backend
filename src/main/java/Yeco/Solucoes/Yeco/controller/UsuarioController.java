package Yeco.Solucoes.Yeco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Yeco.Solucoes.Yeco.model.Usuario;
import Yeco.Solucoes.Yeco.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins="*",allowedHeaders="*")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping
	public ResponseEntity <List<Usuario>> getAll(){
		
		return ResponseEntity.ok(usuarioRepository.findAll());
	}
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> getbyId(@PathVariable long id){
		return usuarioRepository.findById(id)
				.map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("nomeCompleto/{nomeCompleto}")
	public ResponseEntity<List<Usuario>> getBynomeCompleto(@PathVariable String nomeCompleto){
		return ResponseEntity.ok(usuarioRepository.findAllByNomeCompletoContainingIgnoreCase(nomeCompleto));
	}
	@GetMapping("usuario/{usuario}")
	public ResponseEntity<List<Usuario>> getByUsuario(@PathVariable String usuario){
		return ResponseEntity.ok(usuarioRepository.findAllByUsuarioContainingIgnoreCase(usuario));
	}
	@GetMapping("senha/{senha}")
	public ResponseEntity<List<Usuario>> getBySenha(@PathVariable String senha){
		return ResponseEntity.ok(usuarioRepository.findAllBySenhaContainingIgnoreCase(senha));
	}
	@PostMapping
	public ResponseEntity<Usuario> postUsuario (@RequestBody Usuario usuario){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioRepository.save(usuario));	
	}
	@PutMapping
	public ResponseEntity<Usuario> putUsuario (@RequestBody Usuario usuario){
		
		return ResponseEntity.status(HttpStatus.OK).body(usuarioRepository.save(usuario));	
	}
	@DeleteMapping("/{id}")
	public void deleteUsuario(@PathVariable long id) {
		
		usuarioRepository.deleteById(id);
		
	}
}
