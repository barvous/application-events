package br.com.grimoire.applicationevents.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.grimoire.applicationevents.model.Venda;
import br.com.grimoire.applicationevents.service.VendaService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/venda")
@RequiredArgsConstructor
public class VendaController {
    
    private final VendaService vendaService;

    @PostMapping
    public ResponseEntity<Long> criarVenda(@RequestBody Venda venda){

        Long idVenda = vendaService.criarVenda(venda);

        return ResponseEntity.ok().body(idVenda);

    }
}
