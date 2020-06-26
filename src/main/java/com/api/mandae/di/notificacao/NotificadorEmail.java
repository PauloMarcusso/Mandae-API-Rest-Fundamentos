package com.api.mandae.di.notificacao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.api.mandae.di.modelo.Cliente;

@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorEmail implements Notificador {


	@Override
	public void notificar(Cliente cliente, String mensagem) {

		System.out.printf("Notificando %s através do e-mail %s %s %n", cliente.getNome(),
				cliente.getEmail(), mensagem);

	}
}
