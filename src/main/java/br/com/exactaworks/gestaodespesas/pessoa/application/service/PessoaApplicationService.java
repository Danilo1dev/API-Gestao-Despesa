package br.com.exactaworks.gestaodespesas.pessoa.application.service;

import javax.validation.Valid;
import org.springframework.stereotype.Service;
import br.com.exactaworks.gestaodespesas.pessoa.application.api.PessoaResponse;
import br.com.exactaworks.gestaodespesas.pessoa.application.api.pessoaRequest;
import br.com.exactaworks.gestaodespesas.pessoa.application.repository.PessoaRepository;
import br.com.exactaworks.gestaodespesas.pessoa.domain.Pessoa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class PessoaApplicationService implements PessoaService{
	private final PessoaRepository pessoaRepository;

	@Override
	public PessoaResponse criaPessoa(@Valid pessoaRequest pessoaRequest) {
		log.info("[inicia] PessoaApplicationService - criaPessoa");
		Pessoa pessoa = pessoaRepository.salva(new Pessoa(pessoaRequest));
		log.info("[finaliza] PessoaApplicationService - criaPessoa");
		return PessoaResponse.builder()
				.idPessoa(pessoa.getIdPessoa())
				.build();
	}
}
