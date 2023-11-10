package br.com.grimoire.applicationevents.event.subscriber;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import br.com.grimoire.applicationevents.event.UsuarioCriadoEvent;
import br.com.grimoire.applicationevents.model.Usuario;

@Component
public class EmailUsuarioCriadoSubscriber implements ApplicationListener<UsuarioCriadoEvent>{

    @Override
    public void onApplicationEvent(UsuarioCriadoEvent event) {
        Usuario usuario = event.getUsuario();
        System.out.println("Enviando email de boas-vindas para " + usuario.getEmail());
    }
    
}
