package br.com.alura.forum.controller.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.TopicosRepository;

public class AtualizacaoTopicoForm {

	@NotNull
	@NotBlank
	@Length(min = 5)
	private String titulo;
	@NotNull
	@NotBlank
	@Length(min = 5)
	private String mensagem;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Topico atualizar(Long id, TopicosRepository tr) {
		Topico topico = tr.findById(id).get();
		topico.setMensagem(this.mensagem);
		topico.setTitulo(titulo);
		return topico;
	}

}
