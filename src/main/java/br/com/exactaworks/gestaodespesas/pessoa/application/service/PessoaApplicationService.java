package br.com.exactaworks.gestaodespesas.pessoa.application.service;

import java.util.List;
import java.util.UUID;
import javax.validation.Valid;
import org.springframework.stereotype.Service;
import br.com.exactaworks.gestaodespesas.pessoa.application.api.PessoaDetalhadoResponse;
import br.com.exactaworks.gestaodespesas.pessoa.application.api.PessoaListResponse;
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

	@Override
	public List<PessoaListResponse> buscaTodasPessoas() {
		log.info("[inicia] PessoaApplicationService - buscaTodasPessoas");
		List<Pessoa> pessoas = pessoaRepository.buscaTodasPessoas();
		log.info("[finaliza] PessoaApplicationService - buscaTodasPessoas");
		return PessoaListResponse.converte(pessoas);
	}

	@Override
	public PessoaDetalhadoResponse buscaPessoaAtravesID(UUID idPessoa) {
		log.info("[inicia] PessoaApplicationService - buscaPessoaAtravesID");
		Pessoa pessoa = pessoaRepository.buscaPessoaAtravesId(idPessoa);
		log.info("[finaliza] PessoaApplicationService - buscaPessoaAtravesID");
		return new PessoaDetalhadoResponse(pessoa);
	}
}
