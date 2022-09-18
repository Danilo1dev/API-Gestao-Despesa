package br.com.exactaworks.gestaodespesas.application.service;

import java.util.UUID;
import javax.validation.Valid;
import org.springframework.stereotype.Service;
import br.com.exactaworks.gestaodespesas.application.api.DespesaRequest;
import br.com.exactaworks.gestaodespesas.application.api.DespesaResponse;
import br.com.exactaworks.gestaodespesas.application.repository.DespesaRepository;
import br.com.exactaworks.gestaodespesas.despesa.domain.Despesa;
import br.com.exactaworks.gestaodespesas.pessoa.application.service.PessoaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class DespesaApplicationService implements DespesaService {
	private final PessoaService pessoaService;
	private final DespesaRepository despesaRepository;
	
	@Override
	public DespesaResponse criaDespesa(UUID idPessoa, @Valid DespesaRequest despesaRequest) {
		log.info("[inicia] DespesaApplicationService - criaDespesa");
		pessoaService.buscaPessoaAtravesID(idPessoa);
		Despesa despesa = despesaRepository.salvaDespesa(new Despesa(idPessoa, despesaRequest));
		log.info("[finaliza] DespesaApplicationService - criaDespesa");
		return new DespesaResponse(despesa.getIdDespesa());
	}
}
