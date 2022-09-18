package br.com.exactaworks.gestaodespesas.despesa.application.repository;

import br.com.exactaworks.gestaodespesas.despesa.domain.Despesa;

public interface DespesaRepository {
	Despesa salvaDespesa(Despesa despesa);
}
