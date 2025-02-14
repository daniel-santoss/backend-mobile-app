package com.inkstudiomobile.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inkstudiomobile.demo.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	Usuario findByEmailAndSenha(String email, String senha);

}
