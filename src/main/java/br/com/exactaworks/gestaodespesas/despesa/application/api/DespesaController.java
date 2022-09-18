package br.com.exactaworks.gestaodespesas.despesa.application.api;

import java.util.List;
import java.util.UUID;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.RestController;
import br.com.exactaworks.gestaodespesas.despesa.application.service.DespesaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class DespesaController implements DespesaAPI {
	private final DespesaService despesaService;

	@Override
	public DespesaResponse postDespesa(UUID idPessoa, @Valid DespesaRequest despesaRequest) {
		log.info("[inicia] DespesaController - postDespesa");
		log.info("[idPessoa] {}", idPessoa);
		DespesaResponse despesa = despesaService.criaDespesa(idPessoa, despesaRequest);
		log.info("[finaliza] DespesaController - postDespesa");
		return despesa;
	}

	@Override
	public List<DespesaDaPessoaListResponse> getDepesaDaPessoaComId(UUID idPessoa) {
		log.info("[inicia] DespesaController - getDepesaDaPessoaComId");
		log.info("[idPessoa]{}",idPessoa);
		List<DespesaDaPessoaListResponse>DespesaDaPessoa = despesaService.buscaDespesaDaPessoaComId(idPessoa);
		log.info("[finaliza] DespesaController - getDepesaDaPessoaComId");
		return DespesaDaPessoa;
	}

	@Override
	public DespesaDetalhadoResponse getDespesaAtravesId(UUID idPessoa, UUID idDespesa) {
		log.info("[inicia] DespesaController - getDespesaAtravesId");
		log.info("[idPessoa]{} - [idDespesa] {}",idPessoa, idDespesa);
		DespesaDetalhadoResponse despesa = despesaService.buscaDespesaDaPessoaComId(idPessoa, idDespesa);
		log.info("[finaliza] DespesaController - getDespesaAtravesId");
		return despesa;
	}

	@Override
	public void deletaDespasDaPessoaComId(UUID idPessoa, UUID idDespesa) {
		log.info("[inicia] DespesaController - deletaDespasDaPessoaComId");
		log.info("[idPessoa]{} - [idDespesa] {}",idPessoa, idDespesa);
		despesaService.deletaDespesaDaPessoaComId(idPessoa, idDespesa);
		log.info("[finaliza] DespesaController - deletaDespasDaPessoaComId");
	}

	@Override
	public void patchDespesa(UUID idPessoa, UUID idDespesa, @Valid DespesaAlteracaoRequest despesaAlteracaoRequest) {
		log.info("[inicia] DespesaController - patchDespesa");
		log.info("[idPessoa]{} - [idDespesa] {}",idPessoa, idDespesa);
		despesaService.alteraDespesaDaPessoaComId(idPessoa, idDespesa, despesaAlteracaoRequest);
		log.info("[finaliza] DespesaController - patchDespesa");
	}
}

