package com.api.mandae.di.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.mandae.di.modelo.Cliente;
import com.api.mandae.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {

	@Autowired
	private List<Notificador> notificadores;
	
//	public AtivacaoClienteService(Notificador notificador) {
//		this.notificador = notificador;
//	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		for (Notificador notificador : notificadores) {
			
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo");
		}
	}
}
