package br.com.exactaworks.gestaodespesas.pessoa.application.repository;

import java.util.List;
import java.util.UUID;
import br.com.exactaworks.gestaodespesas.pessoa.domain.Pessoa;

public interface PessoaRepository {
	Pessoa salva(Pessoa pessoa);
	List<Pessoa> buscaTodasPessoas();
	Pessoa buscaPessoaAtravesId(UUID idPessoa);
	void deletaPessoa(Pessoa pessoa);
}
