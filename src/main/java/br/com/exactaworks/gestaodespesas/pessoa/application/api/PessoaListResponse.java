package br.com.exactaworks.gestaodespesas.pessoa.application.api;

import java.util.List;
import java.util.stream.Collectors;
import br.com.exactaworks.gestaodespesas.pessoa.domain.Pessoa;
import br.com.exactaworks.gestaodespesas.pessoa.domain.Sexo;
import lombok.Value;

@Value
public class PessoaListResponse {
	private String nomePessoa;
	private String cpf;
	private String idade;
	private Sexo sexo;
	private String telefone;
	private String email;

	public static List<PessoaListResponse> converte(List<Pessoa> pessoas) {
		return null;
		
	}
}
