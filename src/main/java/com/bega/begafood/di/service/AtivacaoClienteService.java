package com.bega.begafood.di.service;

import com.bega.begafood.di.modelo.Cliente;
import com.bega.begafood.di.notificacao.Notificador;
import com.bega.begafood.di.notificacao.NotificadorEmail;
import org.springframework.stereotype.Component;

public class AtivacaoClienteService {

    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;

        System.out.println("AtivacaoClienteService: " + notificador);
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}
