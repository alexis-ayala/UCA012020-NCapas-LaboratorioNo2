package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.uca.capas.domain.Usuario;

@Controller
public class MainController {
	
	@GetMapping("/login")
	public String mostrarLogin(Usuario usuario) {
		return "Login";
	}
	
	@PostMapping("/validacion")
	public String procesarForm(Usuario usuario) {
		if(usuario.isLogin()) {
			return "MostrarMensajeV";
		}else {
			return "MostrarMensajeF";
		}
	}	
	
}
