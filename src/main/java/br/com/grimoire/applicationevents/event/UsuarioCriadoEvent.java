package br.com.grimoire.applicationevents.event;

import org.springframework.context.ApplicationEvent;

import br.com.grimoire.applicationevents.model.Usuario;
import lombok.Getter;

@Getter
public class UsuarioCriadoEvent extends ApplicationEvent{

    private final Usuario usuario;

    public UsuarioCriadoEvent(Object source, Usuario usuario) {
        super(source);
        this.usuario = usuario;
    }
    
}
