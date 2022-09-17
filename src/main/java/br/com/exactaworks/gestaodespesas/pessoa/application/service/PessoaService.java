package br.com.exactaworks.gestaodespesas.pessoa.application.service;

import java.util.List;
import java.util.UUID;
import javax.validation.Valid;
import br.com.exactaworks.gestaodespesas.pessoa.application.api.PessoaAlteracaoRequest;
import br.com.exactaworks.gestaodespesas.pessoa.application.api.PessoaDetalhadoResponse;
import br.com.exactaworks.gestaodespesas.pessoa.application.api.PessoaListResponse;
import br.com.exactaworks.gestaodespesas.pessoa.application.api.PessoaResponse;
import br.com.exactaworks.gestaodespesas.pessoa.application.api.pessoaRequest;

public interface PessoaService {
	PessoaResponse criaPessoa(@Valid pessoaRequest pessoaRequest);
	List<PessoaListResponse> buscaTodasPessoas();
	PessoaDetalhadoResponse buscaPessoaAtravesID(UUID idPessoa);
	void deletaPessoaAtravesID(UUID idPessoa);
	void patchAlteraPessoa(UUID idPessoa, @Valid PessoaAlteracaoRequest pessoaAlteracaoRequest);
}
