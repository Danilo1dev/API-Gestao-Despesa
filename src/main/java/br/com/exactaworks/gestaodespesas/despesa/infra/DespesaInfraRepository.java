package br.com.exactaworks.gestaodespesas.despesa.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.com.exactaworks.gestaodespesas.despesa.application.repository.DespesaRepository;
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

	@Override
	public List<Despesa> buscaDespesaDaPessoaComId(UUID idPessoa) {
		log.info("[inicia] DespesaInfraRepository - buscaDespesaDaPessoaComId");
		var despesa = despesaSpringDataJPARepository.findByIdPessoaCadastrada(idPessoa);
		log.info("[inicia] DespesaInfraRepository - buscaDespesaDaPessoaComId");
		return despesa;
	}
}
