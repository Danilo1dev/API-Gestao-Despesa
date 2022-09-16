package br.com.exactaworks.gestaodespesas.pessoa.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Pessoa {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idPessoa", updatable = false, unique = true, nullable = false)
	private UUID idPessoa;

	@NotBlank
	@Column(unique = true)
	private String nomePessoa;
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
	private LocalDate dataDoCadastro;

	private LocalDateTime dataHoraDaCadastro;
	private LocalDateTime dataHoraDoUltimaAlteracao;
}