package br.com.projeto.api.modelo;

import org.springframework.stereotype.Component;

@Component
public class Mensagem {
    
    public String mensagem;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    

}
