package br.com.exactaworks.gestaodespesas.pessoa.infra;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.exactaworks.gestaodespesas.pessoa.domain.Pessoa;

public interface PessoaSpringDataJPARepository extends JpaRepository<Pessoa,UUID>{
}
