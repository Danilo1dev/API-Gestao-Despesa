package br.com.exactaworks.gestaodespesas.application.repository;

import br.com.exactaworks.gestaodespesas.despesa.domain.Despesa;

public interface DespesaRepository {
	Despesa salvaDespesa(Despesa despesa);
}
