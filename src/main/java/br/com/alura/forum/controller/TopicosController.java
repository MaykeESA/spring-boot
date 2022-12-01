package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@Controller
public class TopicosController {

	@RequestMapping("/topicos")
	@ResponseBody
	public List<Topico> listar() {
		
		Curso curso = new Curso("Java Servlet", "Back-end");
		Topico topico = new Topico("Error 404", "Está dando esse erro na minha aplicação!", curso);
		
		return Arrays.asList(topico);
	}
}
