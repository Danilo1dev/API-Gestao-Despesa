package br.com.exactaworks.gestaodespesas.pessoa.infra;

import java.util.List;
import org.springframework.stereotype.Repository;
import br.com.exactaworks.gestaodespesas.pessoa.application.repository.PessoaRepository;
import br.com.exactaworks.gestaodespesas.pessoa.domain.Pessoa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class PessoaInfraRepository implements PessoaRepository {
	private final PessoaSpringDataJPARepository pessoaSpringDataJPARepository;

	@Override
	public Pessoa salva(Pessoa pessoa) {
		log.info("[inicia]PessoaInfraRepository - salva");
		pessoaSpringDataJPARepository.save(pessoa);
		log.info("[finaliza]PessoaInfraRepository - salva");
		return pessoa;
	}

	@Override
	public List<Pessoa> buscaTodasPessoas() {
		log.info("[inicia]PessoaInfraRepository - buscaTodasPessoas");
		List<Pessoa> todasPessoas = pessoaSpringDataJPARepository.findAll();
		log.info("[finaliza]PessoaInfraRepository - buscaTodasPessoas");
		return todasPessoas;
	}
}
