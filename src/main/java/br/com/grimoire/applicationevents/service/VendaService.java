package br.com.grimoire.applicationevents.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import br.com.grimoire.applicationevents.event.NovaVendaEvent;
import br.com.grimoire.applicationevents.model.Venda;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VendaService {

    private final ApplicationEventPublisher applicationEventPublisher;

    public List<Venda> listarVendas() {
        // Busca a lista de vendas do banco de dados e retorna
        return new ArrayList<>();

    }

    public Venda buscarVenda(Long idVenda) {
        // Busca a venda pelo id passado no parametro no banco de dados
        return new Venda(idVenda);
    }

    public Long criarVenda(Venda venda) {

        venda.setId(1L);// Salva a venda no banco de dados
        applicationEventPublisher.publishEvent(new NovaVendaEvent(this, venda));
        return venda.getId();
    }

    public void atualizarVenda(Venda venda, Long idVenda) {
        // Atualiza a venda no banco de dados
    }

    public void deletarVenda(Long idVenda) {
        // Deleta venda do banco de dados
    }
}
