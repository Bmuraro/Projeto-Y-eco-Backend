package Yeco.Solucoes.Yeco.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Yeco.Solucoes.Yeco.model.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria> findAllByNomeContainingIgnoreCase (String nome);
	public List<Categoria> findAllBySetorContainingIgnoreCase (String setor);
	public List<Categoria> findAllByTipoContainingIgnoreCase (String tipo);

}
