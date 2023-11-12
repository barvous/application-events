package br.com.grimoire.applicationevents.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vendedor {
    
    private Long id;

    private String nome;

    private String cnpj;

    private String email;
}
