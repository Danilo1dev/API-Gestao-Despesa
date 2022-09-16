package br.com.exactaworks.gestaodespesas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class GestaoDespesasApplication {
	@GetMapping
	public String getHomeTeste() {
		return "Gestão de Despesas - API";
	}
	public static void main(String[] args) {
		SpringApplication.run(GestaoDespesasApplication.class, args);
	}
}