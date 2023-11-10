package br.com.grimoire.applicationevents.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    
    private Long id;

    private String nome;

    private String email;
}
