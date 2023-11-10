package br.com.grimoire.applicationevents.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import br.com.grimoire.applicationevents.event.UsuarioCriadoEvent;
import br.com.grimoire.applicationevents.model.Usuario;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final ApplicationEventPublisher applicationEventPublisher;

    public List<Usuario> listarUsuario() {
        List<Usuario> listaUsuario = new ArrayList<>();
        // busca a lista de usuarios do banco de dados

        System.out.println("Listando usuarios...");
        return listaUsuario;
    }

    public Usuario buscaUsuario(Long idUsuario) {
        Usuario usuario = new Usuario();
        // busca o usuario pelo id no banco

        System.out.println("Buscando usuario com o id = " + idUsuario.toString());
        return usuario;
    }

    public Long criarUsuario(Usuario usuario) {

        // salvar o usuario no banco de dados
        System.out.println("Criando o usuario no banco de dados...");

        // Publica o evento informando que o usuario foi criado
        applicationEventPublisher.publishEvent(new UsuarioCriadoEvent(this, usuario));
        return 1L;
    }

    public void atualizarUsuario(Usuario usuario, Long idUsuario) {
        // Atualiza o usuario no banco;
        System.out.println("Atualizando o usuario no banco de dados...");

    }

    public void deletarUsuario(Long idUsuario) {
        // deleta o usuario no banco de dados
        System.out.println("Deletando o usuario do banco de dados...");
    }

}
