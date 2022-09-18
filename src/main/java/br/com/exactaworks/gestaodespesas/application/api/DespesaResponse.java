package br.com.exactaworks.gestaodespesas.application.api;

import java.util.UUID;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class DespesaResponse {
	private UUID idDespesa;
}
