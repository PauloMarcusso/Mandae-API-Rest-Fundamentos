package com.api.mandae.di.notificacao;

import org.springframework.stereotype.Component;

import com.api.mandae.di.modelo.Cliente;

@Component
public class NotificadorEmailMock implements Notificador {


	@Override
	public void notificar(Cliente cliente, String mensagem) {

		System.out.printf("MOCK: Notificação seria enviada para %s através do e-mail %s %s %n", cliente.getNome(),
				cliente.getEmail(), mensagem);

	}
}
