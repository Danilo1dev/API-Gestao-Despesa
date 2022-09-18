package br.com.exactaworks.gestaodespesas.infra;

import org.springframework.stereotype.Repository;
import br.com.exactaworks.gestaodespesas.application.repository.DespesaRepository;
import br.com.exactaworks.gestaodespesas.despesa.domain.Despesa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class DespesaInfraRepository implements DespesaRepository {
	private final DespesaSpringDataJPARepository despesaSpringDataJPARepository;

	@Override
	public Despesa salvaDespesa(Despesa despesa) {
		log.info("[inicia] DespesaInfraRepository - salvaDespesa");
		despesaSpringDataJPARepository.save(despesa);
		log.info("[finaliza] DespesaInfraRepository - salvaDespesa");
		return despesa;
	}
}
