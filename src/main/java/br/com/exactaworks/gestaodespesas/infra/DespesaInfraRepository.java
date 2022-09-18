package br.com.exactaworks.gestaodespesas.infra;

import org.springframework.stereotype.Repository;

import br.com.exactaworks.gestaodespesas.application.repository.DespesaRepository;
import br.com.exactaworks.gestaodespesas.despesa.domain.Despesa;
import lombok.extern.log4j.Log4j2;


@Repository
@Log4j2
public class DespesaInfraRepository implements DespesaRepository {

	@Override
	public Despesa salvaDespesa(Despesa despesa) {
		log.info("[inicia] DespesaInfraRepository - salvaDespesa");
		log.info("[finaliza] DespesaInfraRepository - salvaDespesa");
		return null;
	}
}
