package com.api.mandae.di.notificacao;

import com.api.mandae.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}