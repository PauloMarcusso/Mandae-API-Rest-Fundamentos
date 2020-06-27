package com.api.mandae.di.notificacao;

import org.springframework.stereotype.Component;

import com.api.mandae.di.modelo.Cliente;

@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorSMS implements Notificador {


	@Override
	public void notificar(Cliente cliente, String mensagem) {

		System.out.printf("Notificando %s por SMS %s através dot telefone: %s %n", cliente.getNome(),
				cliente.getTelefone(), mensagem);

	}
}
