package com.api.mandae.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.api.mandae.di.notificacao.NivelUrgencia;
import com.api.mandae.di.notificacao.Notificador;
import com.api.mandae.di.notificacao.TipoDoNotificador;
import com.api.mandae.di.service.ClienteAtivadoEvento;

@Component
public class NotificacaoService {
	
	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;

	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvento event) {
		notificador.notificar(event.getCliente(), "Seu cadastro agora está ativo");
	}
}
