package br.com.grimoire.applicationevents.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Venda {
    
    private Long id;

    private LocalDateTime dataVenda;

    private Usuario usuario;

    private Vendedor vendedor;
}
