package com.api.mandae;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.api.mandae.di.notificacao.Notificador;
import com.api.mandae.di.service.AtivacaoClienteService;

@Configuration
public class ServiceConfig {

	@Bean
	public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
		return new AtivacaoClienteService(notificador);
	}
}
