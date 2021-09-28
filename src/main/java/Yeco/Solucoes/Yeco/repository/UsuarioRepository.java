package Yeco.Solucoes.Yeco.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Yeco.Solucoes.Yeco.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public List<Usuario> findAllByNomeCompletoContainingIgnoreCase (String nomeCompleto);
	public List<Usuario> findAllByUsuarioContainingIgnoreCase (String usuario);
	public List<Usuario> findAllBySenhaContainingIgnoreCase (String senha);
}
