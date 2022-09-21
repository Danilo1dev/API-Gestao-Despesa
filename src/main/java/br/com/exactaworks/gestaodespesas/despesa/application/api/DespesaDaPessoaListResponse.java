package br.com.exactaworks.gestaodespesas.despesa.application.api;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import br.com.exactaworks.gestaodespesas.despesa.domain.Despesa;
import br.com.exactaworks.gestaodespesas.despesa.domain.TipoDespesa;
import lombok.Value;

@Value
public class DespesaDaPessoaListResponse {
	private UUID idDespesa;
	private String descricao;
	private Double valorDespesa;
	private TipoDespesa tipoDespesa;
	private LocalDate dataDaDespesa;
	
	public static List<DespesaDaPessoaListResponse> converte(List<Despesa> despesaDaPessoa) {
		return despesaDaPessoa.stream()
				.map(DespesaDaPessoaListResponse::new)
				.collect(Collectors.toList());
	}

	public DespesaDaPessoaListResponse(Despesa despesa) {
		this.idDespesa = despesa.getIdDespesa();
		this.descricao = despesa.getDescricao();
		this.valorDespesa = despesa.getValorDespesa();
		this.tipoDespesa = despesa.getTipoDespesa();
		this.dataDaDespesa = despesa.getDataDaDespesa();
	}
}
