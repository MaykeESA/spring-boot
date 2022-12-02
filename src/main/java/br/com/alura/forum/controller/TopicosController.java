package br.com.alura.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.TopicosRepository;

@RestController
public class TopicosController {
	
	@Autowired
	private final TopicosRepository tr;
	
	public TopicosController(TopicosRepository tr) {
		this.tr = tr;
	}

	@RequestMapping("/topicos")
	public List<TopicoDto> listar(String nomeCurso) {
		if(nomeCurso == null) {
			List<Topico> topicos = this.tr.findAll();
			return TopicoDto.converter(topicos);
		} else {
			List<Topico> topicos = this.tr.findByCursoNome(nomeCurso);
			return TopicoDto.converter(topicos);
		}
		
	}
}
