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
	private double renda;

	public static List<PessoaListResponse> converte(List<Pessoa> pessoas) {
		return pessoas.stream()
				.map(PessoaListResponse::new)
				.collect(Collectors.toList());
	}

	public PessoaListResponse(Pessoa pessoa) {
		this.nomePessoa = pessoa.getNomePessoa();
		this.cpf = pessoa.getCpf();
		this.idade = pessoa.getIdade();
		this.sexo = pessoa.getSexo();
		this.telefone = pessoa.getTelefone();
		this.email = pessoa.getEmail();
		this.renda = pessoa.getRenda();
	}
}
