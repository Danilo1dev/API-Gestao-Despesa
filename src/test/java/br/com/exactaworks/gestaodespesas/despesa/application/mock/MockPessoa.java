package br.com.exactaworks.gestaodespesas.despesa.application.mock;

import br.com.exactaworks.gestaodespesas.pessoa.application.api.pessoaRequest;
import br.com.exactaworks.gestaodespesas.pessoa.domain.Pessoa;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class MockPessoa {

    public static Pessoa pessoaBuild() {
        return Pessoa.builder()
                .idPessoa(UUID.randomUUID())
                .cpf("14873764726")
                .nomePessoa("Rodrigo")
                .dataHoraDaCadastro(LocalDateTime.now())
                .email("beker_la@hotmail.com")
                .idade("28")
                .renda(100)
                .telefone("73999713718")
                .build();
    }

    public static pessoaRequest pessoaRequestBuild() {
        return pessoaRequest.builder()
                .cpf("14873764726")
                .nomePessoa("Rodrigo")
                .email("beker_la@hotmail.com")
                .idade("28")
                .renda(100)
                .telefone("73999713718")
                .build();
    }
}
