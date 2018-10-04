package mercadodecontas.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
public class Pessoa extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private String nome;
	private String cpf;
	private String login;
	private String email;
	
	@Embedded
	private Endereco enderecos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(Endereco enderecos) {
		this.enderecos = enderecos;
	}

}
