package br.com.grimoire.applicationevents.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.grimoire.applicationevents.model.Usuario;
import br.com.grimoire.applicationevents.service.UsuarioService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {
    
    private final UsuarioService usuarioService;

    @GetMapping
    ResponseEntity<List<Usuario>> listarUsuario(){

        List<Usuario> listaUsuario = usuarioService.listarUsuario();

        return ResponseEntity.ok().body(listaUsuario);

    }

    @GetMapping(path = "/{idUsuario}")
    ResponseEntity<Usuario> buscarUsuario(@PathVariable Long idUsuario){

        Usuario usuario = usuarioService.buscaUsuario(idUsuario);

        return ResponseEntity.ok().body(usuario);

    }

    @PostMapping
    ResponseEntity<Long> criarUsuario(@RequestBody Usuario usuario){

        Long idUsuario = usuarioService.criarUsuario(usuario);

        return ResponseEntity.ok().body(idUsuario);

    }

    @PutMapping(path = "/{idUsuario}")
    ResponseEntity<Void> atualizarUsuario(@PathVariable Long idUsuario, @RequestBody Usuario usuario){

        usuarioService.atualizarUsuario(usuario, idUsuario);

        return ResponseEntity.ok().build();

    }

    @DeleteMapping(path = "/{idUsuario}")
    ResponseEntity<Void> atualizarUsuario(@PathVariable Long idUsuario){

        usuarioService.deletarUsuario(idUsuario);

        return ResponseEntity.ok().build();

    }
}
