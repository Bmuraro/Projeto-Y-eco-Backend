package Yeco.Solucoes.Yeco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Yeco.Solucoes.Yeco.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
