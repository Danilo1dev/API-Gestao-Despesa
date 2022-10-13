package br.com.exactaworks.gestaodespesas.despesa.application.service;


import br.com.exactaworks.gestaodespesas.despesa.application.mock.MockPessoa;
import br.com.exactaworks.gestaodespesas.pessoa.application.api.PessoaDetalhadoResponse;
import br.com.exactaworks.gestaodespesas.pessoa.application.api.PessoaResponse;
import br.com.exactaworks.gestaodespesas.pessoa.application.repository.PessoaRepository;
import br.com.exactaworks.gestaodespesas.pessoa.application.service.PessoaApplicationService;
import br.com.exactaworks.gestaodespesas.pessoa.infra.PessoaInfraRepository;
import br.com.exactaworks.gestaodespesas.pessoa.infra.PessoaSpringDataJPARepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PessoaServiceTest {

    @InjectMocks
    private PessoaApplicationService pessoaService;

    @Mock
    private PessoaInfraRepository pessoaRepository;

    @Test
    void testCreatePessoaSucess(){
        when(pessoaRepository.salva(any())).thenReturn(MockPessoa.pessoaBuild());

        PessoaResponse pessoaResponse = pessoaService.criaPessoa(MockPessoa.pessoaRequestBuild());

        assertNotNull(pessoaResponse);
    }

    @Test
    void testFindByIDSucess(){
        when(pessoaRepository.buscaPessoaAtravesId(any())).thenReturn(MockPessoa.pessoaBuild());

        PessoaDetalhadoResponse pessoaResponse = pessoaService.buscaPessoaAtravesID(UUID.randomUUID());

        assertNotNull(pessoaResponse);
    }

    @Test
    void testFindByIDNotFound(){

        when(pessoaRepository.buscaPessoaAtravesId(any())).thenThrow(new RuntimeException("Pessoa não encontrada!"));

        RuntimeException exception = assertThrows(RuntimeException.class, () -> pessoaService.buscaPessoaAtravesID(UUID.randomUUID()));

        assertNotNull(exception);
        assertEquals("Pessoa não encontrada!", exception.getMessage());

    }

}
