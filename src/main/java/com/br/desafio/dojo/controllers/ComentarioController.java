package com.br.desafio.dojo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.br.desafio.dojo.models.ComentarioModel;
import com.br.desafio.dojo.services.ComentarioService;

@Controller
public class ComentarioController {
	
	@Autowired
	private ComentarioService comentarioService;
	
	@GetMapping
	public ModelAndView realizarComentario() {
		ModelAndView modelAndView = new ModelAndView("/");
		modelAndView.addObject("Comentarios", comentarioService.mostrarComentario());
		return modelAndView;
	}
	@PostMapping
	public String salvaComentario(ComentarioModel comentarioModel) {
		comentarioService.addComentario(comentarioModel);
		return"redirect:/";
	}
}
