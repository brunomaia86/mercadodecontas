package mercadodecontas.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.br.CPF;

@Entity
@Table(name = "tb_pessoa")
public class Pessoa extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@NotBlank
	@Column(nullable = true, length = 150)
	private String nome;
	
	/*@CPF*/
	@NotBlank
	@Column(nullable = false)
	private String cpf;

	@NotBlank
	private String login;
	
	@NotBlank
	@Email
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
