package br.com.home.microsservices.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.home.microsservices.entities.EnderecoFornecedor;

@RestController
@RequestMapping("/info")
public class FornecedorController {

//Alteração1
	@GetMapping("/{estado}")
	public ResponseEntity<EnderecoFornecedor> find(@PathVariable String estado){
		
		EnderecoFornecedor end = new EnderecoFornecedor("72870-277", "Valparaíso1", "Rua s/n, Quadra 99");
		
		
		return ResponseEntity.ok(end);
	}
	
	
}
