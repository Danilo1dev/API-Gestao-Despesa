package br.com.exactaworks.gestaodespesas.despesa.application.service;

import java.util.List;
import java.util.UUID;
import javax.validation.Valid;

import br.com.exactaworks.gestaodespesas.despesa.application.api.DespesaDaPessoaListResponse;
import br.com.exactaworks.gestaodespesas.despesa.application.api.DespesaDetalhadoResponse;
import br.com.exactaworks.gestaodespesas.despesa.application.api.DespesaRequest;
import br.com.exactaworks.gestaodespesas.despesa.application.api.DespesaResponse;

public interface DespesaService {
	DespesaResponse criaDespesa(UUID idPessoa, @Valid DespesaRequest despesaRequest);
	List<DespesaDaPessoaListResponse> buscaDespesaDaPessoaComId(UUID idPessoa);
	DespesaDetalhadoResponse buscaDespesaDaPessoaComId(UUID idPessoa, UUID idDespesa);
}
