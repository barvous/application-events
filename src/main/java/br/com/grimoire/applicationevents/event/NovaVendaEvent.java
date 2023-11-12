package br.com.grimoire.applicationevents.event;

import org.springframework.context.ApplicationEvent;

import br.com.grimoire.applicationevents.model.Venda;
import lombok.Getter;

@Getter
public class NovaVendaEvent extends ApplicationEvent {

    private final Venda venda;

    public NovaVendaEvent(Object source, Venda venda) {
        super(source);
        this.venda = venda;
    }

}
