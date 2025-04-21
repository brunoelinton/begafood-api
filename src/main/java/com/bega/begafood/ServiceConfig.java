package com.bega.begafood;

import com.bega.begafood.di.notificacao.Notificador;
import com.bega.begafood.di.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public AtivacaoClienteService ativacaoClienteService(Notificador notificador2) {
        return new AtivacaoClienteService(notificador2);
    }
}
