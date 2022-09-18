package br.com.exactaworks.gestaodespesas.infra;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.exactaworks.gestaodespesas.despesa.domain.Despesa;

public interface DespesaSpringDataJPARepository extends JpaRepository<Despesa, UUID>{
}
