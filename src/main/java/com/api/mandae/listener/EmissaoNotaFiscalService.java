package com.api.mandae.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.api.mandae.di.service.ClienteAtivadoEvento;

@Component
public class EmissaoNotaFiscalService {

	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvento event) {
		System.out.println("Emitindo nota fiscal para " + event.getCliente().getNome());
	}
	
}
