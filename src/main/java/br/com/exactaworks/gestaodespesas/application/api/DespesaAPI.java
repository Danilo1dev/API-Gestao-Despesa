package br.com.exactaworks.gestaodespesas.application.api;

import java.util.UUID;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/pessoa/{idPessoa}/despesa")
public interface DespesaAPI {

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	DespesaResponse postDespesa(@PathVariable UUID idPessoa, @Valid @RequestBody DespesaRequest despesaRequest);
}
