package br.com.exactaworks.gestaodespesas.pessoa.application.api;

import br.com.exactaworks.gestaodespesas.pessoa.domain.Sexo;
import lombok.Value;

@Value
public class PessoaDetalhadoResponse {
	private String nomePessoa;
	private String cpf;
	private String idade;
	private Sexo sexo;
	private String telefone;
	private String email;

}
