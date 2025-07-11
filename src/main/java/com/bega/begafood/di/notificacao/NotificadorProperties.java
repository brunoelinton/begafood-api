package com.bega.begafood.di.notificacao;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "notificador.email")
public class NotificadorProperties {

    /*
    * Host do servidor de e-mail
    * */
    private String hostServidor;

    /*
    * Porta do servidor de e-mail*/
    private Integer portaServidor = 25;

    public Integer getPortaServidor() {
        return portaServidor;
    }

    public void setPortaServidor(Integer portaServidor) {
        this.portaServidor = portaServidor;
    }

    public String getHostServidor() {
        return hostServidor;
    }

    public void setHostServidor(String hostServidor) {
        this.hostServidor = hostServidor;
    }
}
