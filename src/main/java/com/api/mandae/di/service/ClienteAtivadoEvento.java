package com.api.mandae.di.service;

import com.api.mandae.di.modelo.Cliente;

public class ClienteAtivadoEvento {

	private Cliente cliente;

	public ClienteAtivadoEvento(Cliente cliente) {
		super();
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

}
