package com.projeto.projetoapijavaangular.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GeradorSenhaEncodada {

	public static void main(String[] args) {
		
    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    System.out.println("Senha encondada do Administrador é " + encoder.encode("admin"));
    
    
    System.out.println("Senha encodada do Raphael Rocha é  "+ encoder.encode("raphinha"));
		
	}

}
