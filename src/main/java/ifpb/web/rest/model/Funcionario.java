package ifpb.web.rest.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long matricula;
	private String email;
	private String senha;
	private String cargo;
	private String nome;
	private int idade;
	private Long cpf;

	public Funcionario() {
	}

	public Funcionario(Long matricula, String email, String senha, String cargo, String nome, int idade, Long cpf) {
		super();
		this.matricula = matricula;
		this.email = email;
		this.senha = senha;
		this.cargo = cargo;
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}

	@Column
	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cargo, cpf, email, idade, matricula, nome, senha);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Objects.equals(cargo, other.cargo) && Objects.equals(cpf, other.cpf)
				&& Objects.equals(email, other.email) && idade == other.idade
				&& Objects.equals(matricula, other.matricula) && Objects.equals(nome, other.nome)
				&& Objects.equals(senha, other.senha);
	}
}