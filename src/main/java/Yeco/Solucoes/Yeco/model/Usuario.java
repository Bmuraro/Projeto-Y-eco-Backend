package Yeco.Solucoes.Yeco.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message="O campo nome completo é obrigatório")
	@Size(min=5,max=100,message="O campo deve conter no mínimo 5 e no máximo 100 caracteres")
	private String nomeCompleto;
	
	@NotNull(message="O campo nome completo é obrigatório")
	@Size(min=5,max=100,message="O campo deve conter no mínimo 5 e no máximo 100 caracteres")
	private String usuario;
	
	@NotNull(message="O campo nome completo é obrigatório")
	@Size(min=5,max=100,message="O campo deve conter no mínimo 5 e no máximo 100 caracteres")
	private String senha;
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
