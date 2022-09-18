package br.com.exactaworks.gestaodespesas.despesa.application.api;

import java.time.LocalDate;
import java.util.UUID;
import br.com.exactaworks.gestaodespesas.despesa.domain.TipoDespesa;
import lombok.Value;

@Value
public class DespesaDetalhadoResponse {
	private UUID idDespesa;
	private String descricao;
	private Double valorDespesa;
	private TipoDespesa tipoDespesa;
	private LocalDate dataDaDespesa;
}
