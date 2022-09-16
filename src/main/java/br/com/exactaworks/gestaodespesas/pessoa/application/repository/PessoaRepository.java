package br.com.exactaworks.gestaodespesas.pessoa.application.repository;

import br.com.exactaworks.gestaodespesas.pessoa.domain.Pessoa;

public interface PessoaRepository {
	Pessoa salva(Pessoa pessoa);
}
