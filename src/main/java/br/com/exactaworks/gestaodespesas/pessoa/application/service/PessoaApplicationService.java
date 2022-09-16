package br.com.exactaworks.gestaodespesas.pessoa.application.service;

import javax.validation.Valid;
import org.springframework.stereotype.Service;
import br.com.exactaworks.gestaodespesas.pessoa.application.api.PessoaResponse;
import br.com.exactaworks.gestaodespesas.pessoa.application.api.pessoaRequest;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class PessoaApplicationService implements PessoaService{

	@Override
	public PessoaResponse criaPessoa(@Valid pessoaRequest pessoaRequest) {
		log.info("[inicia] PessoaApplicationService - criaPessoa");
		log.info("[finaliza] PessoaApplicationService - criaPessoa");
		return null;
	}
}
