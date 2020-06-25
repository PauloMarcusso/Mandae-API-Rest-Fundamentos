package com.api.mandae;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.api.mandae.di.notificacao.NotificadorEmail;
import com.api.mandae.di.service.AtivacaoClienteService;

//@Configuration
public class MandaeConfig {

	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.mandaemail.com.br");
		notificador.setCaixaAlta(true);
		return notificador;
	}
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService() {
		return new AtivacaoClienteService(notificadorEmail());
	}
}
