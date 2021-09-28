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

import Yeco.Solucoes.Yeco.model.Produto;
import Yeco.Solucoes.Yeco.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
@CrossOrigin(origins="*",allowedHeaders="*")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public ResponseEntity<List<Produto>> getAll(){
        return ResponseEntity.ok(produtoRepository.findAll());}
        
     @GetMapping("/{id}")
     public ResponseEntity<Produto> getById(@PathVariable long id){
    	 return produtoRepository.findById(id) 
    			 .map(resposta -> ResponseEntity.ok(resposta))
    			 .orElse(ResponseEntity.notFound().build());
     }
     @GetMapping("nome/{nome}")
     public ResponseEntity<List<Produto>> getByNome(@PathVariable String nome){
    	 return ResponseEntity.ok(produtoRepository.findAllByNomeContainingIgnoreCase(nome));
     }
     @GetMapping("descricao/{descricao}")
     public ResponseEntity<List<Produto>> getByDescricao(@PathVariable String descricao){
    	 return ResponseEntity.ok(produtoRepository.findAllByDescricaoContainingIgnoreCase(descricao));
     }
     @GetMapping("valor/{valor}")
     public ResponseEntity<List<Produto>> getByValor(@PathVariable Double valor){
    	 return ResponseEntity.ok(produtoRepository.findAllByValorContainingIgnoreCase(valor));
     }
     @GetMapping("quantidade/{quantidade}")
     public ResponseEntity<List<Produto>> getByQuantidade(@PathVariable Integer quantidade){
    	 return ResponseEntity.ok(produtoRepository.findAllByQuantidadeContainingIgnoreCase(quantidade));
     }
     @PostMapping
     public ResponseEntity<Produto> postProduto(@RequestBody Produto produto){
    	 return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepository.save(produto));
     }
     @PutMapping
     public ResponseEntity<Produto> putProduto(@RequestBody Produto produto){
    	 return ResponseEntity.status(HttpStatus.OK).body(produtoRepository.save(produto));
     }
     @DeleteMapping("/{id}")
     public void deleteProduto(@PathVariable long id){
    	 produtoRepository.deleteById(id);
    	 
     }

     
    }

