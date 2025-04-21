package com.bega.begafood;

import com.bega.begafood.di.notificacao.NotificadorEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificacaoConfig {

    @Bean
    public NotificadorEmail notificadorEmail() {
        NotificadorEmail notificador = new NotificadorEmail("smtp.gmail.com.br");
        notificador.setCaixaAlta(true);
        return notificador;
    }
}
