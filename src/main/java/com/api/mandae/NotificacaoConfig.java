package com.api.mandae;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.api.mandae.di.notificacao.NotificadorEmail;

@Configuration
public class NotificacaoConfig {

	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.mandaemail.com.br");
		notificador.setCaixaAlta(true);
		return notificador;
	}
	
}
