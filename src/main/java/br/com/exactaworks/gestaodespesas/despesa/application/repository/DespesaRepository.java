package br.com.exactaworks.gestaodespesas.despesa.application.repository;

import java.util.List;
import java.util.UUID;
import br.com.exactaworks.gestaodespesas.despesa.domain.Despesa;

public interface DespesaRepository {
	Despesa salvaDespesa(Despesa despesa);
	List<Despesa> buscaDespesaDaPessoaComId(UUID idPessoa);
	Despesa buscaDespesaPeloId(UUID idDespesa);
	void deletaDespesaId(Despesa despesa);
}
