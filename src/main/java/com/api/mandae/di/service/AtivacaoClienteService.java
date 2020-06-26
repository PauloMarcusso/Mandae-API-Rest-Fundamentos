package com.api.mandae.di.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.mandae.di.modelo.Cliente;
import com.api.mandae.di.notificacao.NivelUrgencia;
import com.api.mandae.di.notificacao.Notificador;
import com.api.mandae.di.notificacao.TipoDoNotificador;

@Component
public class AtivacaoClienteService {

	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;

	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema está ativo");
	}
}
