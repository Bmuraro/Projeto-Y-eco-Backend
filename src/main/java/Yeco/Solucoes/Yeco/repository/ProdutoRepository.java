package Yeco.Solucoes.Yeco.repository;

import Yeco.Solucoes.Yeco.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
