package br.com.exactaworks.gestaodespesas.application.service;

import java.util.UUID;

import javax.validation.Valid;
import br.com.exactaworks.gestaodespesas.application.api.DespesaRequest;
import br.com.exactaworks.gestaodespesas.application.api.DespesaResponse;


public interface DespesaService {
	DespesaResponse criaDespesa(UUID idPessoa, @Valid DespesaRequest despesaRequest);
}
