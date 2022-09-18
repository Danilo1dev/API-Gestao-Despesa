package br.com.exactaworks.gestaodespesas.application.api;

import java.time.LocalDate;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import br.com.exactaworks.gestaodespesas.despesa.domain.TipoDespesa;
import lombok.Value;

@Value
public class DespesaRequest {
	@NotNull
	@NotBlank(message = "Insira uma descrição")
	@Size(max = 100)
	private String descricao;
	@NotNull
	private Double valorDespesa;
	private TipoDespesa tipoDespesa;
	@NotNull
	private LocalDate dataDaDespesa;
}
