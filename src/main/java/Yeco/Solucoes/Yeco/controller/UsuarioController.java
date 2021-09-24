package Yeco.Solucoes.Yeco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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

}
