package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@RestController
public class TopicosController {

	@RequestMapping("/topicos")
	public List<TopicoDto> listar() {
		
		Curso curso = new Curso("Java Servlet", "Back-end");
		Topico topico = new Topico("Error 404", "Está dando esse erro na minha aplicação!", curso);
		TopicoDto topicoDto = new TopicoDto(topico);
		
		return Arrays.asList(topicoDto);
	}
}
