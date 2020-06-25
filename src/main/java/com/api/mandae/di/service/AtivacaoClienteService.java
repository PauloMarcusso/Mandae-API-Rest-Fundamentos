package com.api.mandae.di.service;

import org.springframework.stereotype.Component;

import com.api.mandae.di.modelo.Cliente;
import com.api.mandae.di.notificacao.NotificadorEmail;

@Component
public class AtivacaoClienteService {

	NotificadorEmail notificador;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "Seu cadastro está ativo");
	}
}
