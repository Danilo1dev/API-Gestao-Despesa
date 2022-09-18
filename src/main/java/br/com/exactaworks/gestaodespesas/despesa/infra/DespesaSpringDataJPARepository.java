package br.com.exactaworks.gestaodespesas.despesa.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.exactaworks.gestaodespesas.despesa.domain.Despesa;

public interface DespesaSpringDataJPARepository extends JpaRepository<Despesa, UUID>{
	List<Despesa>  findByIdPessoaCadastrada(UUID idPessoaCadastrada);
}
