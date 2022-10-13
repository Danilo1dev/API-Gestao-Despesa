package br.com.exactaworks.gestaodespesas.pessoa.domain;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.exactaworks.gestaodespesas.despesa.domain.Despesa;
import br.com.exactaworks.gestaodespesas.pessoa.application.api.PessoaAlteracaoRequest;
import br.com.exactaworks.gestaodespesas.pessoa.application.api.pessoaRequest;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
@Builder
@AllArgsConstructor
public class Pessoa {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idPessoa", updatable = false, unique = true, nullable = false)
	private UUID idPessoa;

	@NotBlank
	@Column(unique = true)
	private String nomePessoa;
	
	@OneToMany (mappedBy = "pessoa")
	private List<Despesa> despesa;
	
	@NotBlank
	@Size(max = 11)
	@Column(unique = true)
	private String cpf;
	@NotBlank
	@Size(max = 2)
	private String idade;
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	@NotBlank
	private String telefone;
	@Email
	private String email;
	@NotNull
	private double renda;
	
	private LocalDateTime dataHoraDaCadastro;
	private LocalDateTime dataHoraDoUltimaAlteracao;
	
	public Pessoa(@Valid pessoaRequest pessoaRequest) {
		this.nomePessoa = pessoaRequest.getNomePessoa();
		this.cpf = pessoaRequest.getCpf();
		this.idade = pessoaRequest.getIdade();
		this.sexo = pessoaRequest.getSexo();
		this.telefone = pessoaRequest.getTelefone();
		this.email = pessoaRequest.getEmail();
		this.renda = pessoaRequest.getRenda();
		this.dataHoraDaCadastro = LocalDateTime.now();
	}

	public void altera(@Valid PessoaAlteracaoRequest pessoaAlteracaoRequest) {
		this.nomePessoa = pessoaAlteracaoRequest.getNomePessoa();
		this.cpf = pessoaAlteracaoRequest.getCpf();
		this.idade = pessoaAlteracaoRequest.getIdade();
		this.sexo = pessoaAlteracaoRequest.getSexo();
		this.telefone = pessoaAlteracaoRequest.getTelefone();
		this.email = pessoaAlteracaoRequest.getEmail();
		this.renda = pessoaAlteracaoRequest.getRenda();
		this.dataHoraDoUltimaAlteracao = LocalDateTime.now();
	}
}