package br.com.exactaworks.gestaodespesas.despesa.domain;

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
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Despesa {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idDespesa", updatable = false, unique = true, nullable = false)
	private UUID idDespesa;
	@NotNull
	@Column(columnDefinition = "uuid", name = "idPessoaCadastrada", nullable = false)
	private UUID idPessoaCadastrada;
	
	@NotNull
	@NotBlank(message = "Insira uma descrição")
	@Size(max = 100)
	private String descrição;
	@NotNull
	private Double valorDespesa;
	@Enumerated(EnumType.STRING)
	private TipoDespesa tipoDespesa;
	@NotNull
	private LocalDate dataDaDespesa;
	
	private LocalDateTime dataHoraDoCadastroDespesa;
	private LocalDateTime dataHoraDoUltimaAlteracaoDespesa;
}
