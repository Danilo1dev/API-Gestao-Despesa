package br.com.exactaworks.gestaodespesas.application.api;

import java.util.UUID;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.RestController;
import br.com.exactaworks.gestaodespesas.application.service.DespesaService;
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
}

