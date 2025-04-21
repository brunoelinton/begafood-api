package com.bega.begafood.di.notificacao;

import com.bega.begafood.di.modelo.Cliente;

public interface Notificador {

    public void notificar(Cliente cliente, String mensagem);
}
