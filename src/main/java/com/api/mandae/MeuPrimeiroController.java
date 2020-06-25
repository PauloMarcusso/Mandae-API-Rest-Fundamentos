package com.api.mandae;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.api.mandae.di.modelo.Cliente;
import com.api.mandae.di.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {

	private AtivacaoClienteService ativacaoClienteService;
	
	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
		
		System.out.println("Meu primeiro controller:" + ativacaoClienteService);
	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		
		Cliente joao = new Cliente("Joao","joao@email.com","33232323232");
		ativacaoClienteService.ativar(joao);
		
		return "Obbaaa!";
	}
}
