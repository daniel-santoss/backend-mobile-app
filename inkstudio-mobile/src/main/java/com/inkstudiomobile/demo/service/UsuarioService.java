package com.inkstudiomobile.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inkstudiomobile.demo.model.Usuario;
import com.inkstudiomobile.demo.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Optional<Usuario> login(String email, String senha) {
        return Optional.ofNullable(usuarioRepository.findByEmailAndSenha(email, senha));
    }

    public Optional<Usuario> findById(Long id) {
        return usuarioRepository.findById(id);
    }
}
