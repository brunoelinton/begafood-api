package com.bega.begafood.di.service;

import com.bega.begafood.di.modelo.Cliente;
import com.bega.begafood.di.notificacao.NivelUrgencia;
import com.bega.begafood.di.notificacao.Notificador;
import com.bega.begafood.di.notificacao.TipoDoNotificador;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class AtivacaoClienteService implements InitializingBean, DisposableBean {

    @TipoDoNotificador(NivelUrgencia.NORMAL)
    @Autowired
    private Notificador notificador;

//    public AtivacaoClienteService(Notificador notificador) {
//        this.notificador = notificador;
//
//        System.out.println("AtivacaoClienteService: " + notificador);
//    }

//    public AtivacaoClienteService(String qualquerCoisa) {
//
//    }

//  @PostConstruct
    public void init() {
        System.out.println("INIT " + notificador);
    }

//  @PreDestroy
    public void destroy() {
        System.out.println("DESTROY");
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");

    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

//    @Autowired
//    public void sNotificador(Notificador notificador) {
//        this.notificador = notificador;
//    }
}
