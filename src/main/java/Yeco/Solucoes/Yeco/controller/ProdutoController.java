package Yeco.Solucoes.Yeco.controller;

import Yeco.Solucoes.Yeco.model.Produto;
import Yeco.Solucoes.Yeco.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
@CrossOrigin(origins="*",allowedHeaders="*")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @GetMapping
    public ResponseEntity<List<Produto>> getAll(){
        return ResponseEntity.ok(repository.findAll());
    }
}
