package Yeco.Solucoes.Yeco.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Yeco.Solucoes.Yeco.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
	public List<Produto> findAllByDescricaoContainingIgnoreCase(String descricao);
	public List<Produto> findAllByValorContainingIgnoreCase(Double valor);
	public List<Produto> findAllByQuantidadeContainingIgnoreCase(Integer quantidade);
}
