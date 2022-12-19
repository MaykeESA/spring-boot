package br.com.alura.forum.controller.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.CursoRepository;

public class TopicoForm {

	@NotNull @NotEmpty @NotBlank @Size(min = 5)
	private String titulo;
	@NotNull @NotEmpty @NotBlank @Size(min = 5)
	private String mensagem;
	private String nomeCurso;

	public TopicoForm(String titulo, String mensagem, String nomeCurso) {
		this.titulo = titulo;
		this.mensagem = mensagem;
		this.nomeCurso = nomeCurso;
	}
	
	public Topico converter(CursoRepository cr) {
		Curso curso = cr.findByNome(this.nomeCurso);
		return new Topico(this.titulo, this.mensagem, curso);
	}
	
	public String getTitulo() {
		return titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

}
