package br.com.exactaworks.gestaodespesas.despesa.application.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import br.com.exactaworks.gestaodespesas.despesa.domain.Despesa;
import br.com.exactaworks.gestaodespesas.despesa.domain.TipoDespesa;
import br.com.exactaworks.gestaodespesas.pessoa.application.api.PessoaDetalhadoResponse;

class DespesaDetalhadoResponseTest {

	@Test
	void deveraSerIgual() {
		var pessoa = PessoaDetalhadoResponse.builder().nomePessoa("Danilo").build();
		UUID idDespesa = UUID.randomUUID();
		String descricaoDespesa = "Descricao Despesa Test";
		Double valor = 100.0;
		TipoDespesa tipo = TipoDespesa.ALIMENTACAO;
		LocalDate data = LocalDate.now();

		var despesaDetalhada = buildDepesaDetalhada(pessoa, idDespesa, descricaoDespesa, valor, tipo, data);
		
		assertEquals(despesaDetalhada.getIdDespesa(), idDespesa);
		assertEquals(despesaDetalhada.getDescricao(), descricaoDespesa);
		assertEquals(despesaDetalhada.getValorDespesa(), valor);
	}

	private DespesaDetalhadoResponse buildDepesaDetalhada(PessoaDetalhadoResponse pessoa, UUID idDespesa, String descricaoDespesa,
			Double valor, TipoDespesa tipo, LocalDate data) {
		Despesa despesa = Despesa.builder()
		.idDespesa(idDespesa)
		.descricao(descricaoDespesa)
		.valorDespesa(valor)
		.tipoDespesa(tipo)
		.dataDaDespesa(data)
		.build();
		var despesaDetalhada = new DespesaDetalhadoResponse(despesa, pessoa);
		return despesaDetalhada;
	}
}
