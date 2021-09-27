package Yeco.Solucoes.Yeco.controller;

import java.util.List;

import Yeco.Solucoes.Yeco.model.Categoria;
import Yeco.Solucoes.Yeco.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;





public class CategoriaController {
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	@GetMapping
	public ResponseEntity <List<Categoria>> getAll(){
		return ResponseEntity.ok(categoriaRepository.findAll()); 

}
}
