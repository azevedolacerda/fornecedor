package br.com.home.microsservices.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
@Getter
public class EnderecoFornecedor {

	private String cep;
	private String cidade;
	private String logradouro;
	
}
