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
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.exactaworks.gestaodespesas.despesa.application.api.DespesaAlteracaoRequest;
import br.com.exactaworks.gestaodespesas.despesa.application.api.DespesaRequest;
import br.com.exactaworks.gestaodespesas.pessoa.domain.Pessoa;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Despesa {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idDespesa", updatable = false, unique = true, nullable = false)
	private UUID idDespesa;
	@NotNull
	@Column(columnDefinition = "uuid", name = "idPessoaCadastrada", nullable = false)
	private UUID idPessoaCadastrada;
	
	@ManyToOne
	private Pessoa pessoa;
	
	@NotNull
	@NotBlank(message = "Insira uma descrição")
	@Size(max = 100)
	private String descricao;
	@NotNull
	private Double valorDespesa;
	@Enumerated(EnumType.STRING)
	private TipoDespesa tipoDespesa;
	@NotNull
	private LocalDate dataDaDespesa;
	
	private LocalDateTime dataHoraDoCadastroDespesa;
	private LocalDateTime dataHoraDoUltimaAlteracaoDespesa;

	public Despesa(UUID idPessoa, @Valid DespesaRequest despesaRequest) {
		this.idPessoaCadastrada = idPessoa;
		this.descricao = despesaRequest.getDescricao();
		this.valorDespesa = despesaRequest.getValorDespesa();
		this.tipoDespesa = despesaRequest.getTipoDespesa();
		this.dataDaDespesa = despesaRequest.getDataDaDespesa();
		this.dataHoraDoCadastroDespesa = LocalDateTime.now();
	}

	public void altera(@Valid DespesaAlteracaoRequest despesaAlteracaoRequest) {
		this.descricao = despesaAlteracaoRequest.getDescricao();
		this.valorDespesa = despesaAlteracaoRequest.getValorDespesa();
		this.tipoDespesa = despesaAlteracaoRequest.getTipoDespesa();
		this.dataDaDespesa = despesaAlteracaoRequest.getDataDaDespesa();
		this.dataHoraDoUltimaAlteracaoDespesa = LocalDateTime.now();
	}
}
