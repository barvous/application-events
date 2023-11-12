package br.com.grimoire.applicationevents.event.subscriber;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import br.com.grimoire.applicationevents.event.NovaVendaEvent;
import br.com.grimoire.applicationevents.model.Usuario;
import br.com.grimoire.applicationevents.model.Venda;
import br.com.grimoire.applicationevents.model.Vendedor;

@Component
public class EmailNovaVendaSubscriber implements ApplicationListener<NovaVendaEvent>{

    @Override
    public void onApplicationEvent(NovaVendaEvent event) {
        Venda venda = event.getVenda();
        Usuario usuario = venda.getUsuario();
        Vendedor vendedor = venda.getVendedor();

        System.out.println("Enviando email de notificação para o usuario " + usuario.getEmail());
        System.out.println("Enviando email de notificação para o vendedor " + vendedor.getEmail());
    }
    
}
