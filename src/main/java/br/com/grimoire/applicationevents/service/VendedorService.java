package br.com.grimoire.applicationevents.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.grimoire.applicationevents.model.Vendedor;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VendedorService {

    public List<Vendedor> listarVendedors() {
        // Busca a lista de vendedors do banco de dados e retorna
        return new ArrayList<>();

    }

    public Vendedor buscarVendedor(Long idVendedor) {
        // Busca a vendedor pelo id passado no parametro no banco de dados
        return new Vendedor(idVendedor);
    }

    public Long criarVendedor(Vendedor vendedor) {

        vendedor.setId(1L);// Salva a vendedor no banco de dados
        return vendedor.getId();
    }

    public void atualizarVendedor(Vendedor vendedor, Long idVendedor) {
        // Atualiza a vendedor no banco de dados
    }

    public void deletarVendedor(Long idVendedor) {
        // Deleta vendedor do banco de dados
    }
}
