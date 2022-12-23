package br.com.alura.forum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

import br.com.alura.forum.repository.CursoRepository;
import br.com.alura.forum.repository.TopicosRepository;
import br.com.alura.forum.repository.UsuarioRepository;

@SuppressWarnings("unused")
@SpringBootApplication
@EnableCaching
@EnableSpringDataWebSupport
public class ForumApplication implements CommandLineRunner {

	@Autowired
	private TopicosRepository tr;
	@Autowired
	private CursoRepository cr;
	@Autowired
	private UsuarioRepository ur;

	public static void main(String[] args) {
		SpringApplication.run(ForumApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*
		 * Curso cursoBack = new Curso("Spring Boot", "Back-end"); Curso cursoFront =
		 * new Curso("Vue.js", "Front-end"); Curso cursoSeguranca = new Curso("Pentest",
		 * "Dev-ops");
		 * 
		 * this.cr.save(cursoBack); this.cr.save(cursoFront);
		 * this.cr.save(cursoSeguranca);
		 * 
		 * # Senha BCrypt: #
		 * $2a$10$Zlu7OQJW.OVbb4JrUEHawuuG7DdZt09c9AnlUlenSjT3P5dEFiBC2
		 * 
		 * Usuario user1 = new Usuario("Mayke", "mayke@mail.com", "senha123"); Usuario
		 * user2 = new Usuario("Gustavo", "gustavo@mail.com", "senha123"); Usuario user3
		 * = new Usuario("Andre", "andre@mail.com", "senha123");
		 * 
		 * this.ur.save(user1); this.ur.save(user2); this.ur.save(user3);
		 * 
		 * Curso c = this.cr.findById((long) 1).get(); Usuario u =
		 * this.ur.findById((long) 1).get(); Topico top = new Topico("Error 404",
		 * "'Qual o significado do 404?'", c, u);
		 * 
		 * Curso c1 = this.cr.findById((long) 2).get(); Usuario u1 =
		 * this.ur.findById((long) 2).get(); Topico top1 = new
		 * Topico("Componente bugado", "Componente não funciona", c1, u1);
		 * 
		 * Curso c2 = this.cr.findById((long) 1).get(); Usuario u2 =
		 * this.ur.findById((long) 3).get(); Topico top2 = new
		 * Topico("Gobuster não acha endpoint",
		 * "Gobuster não acha endpoints de uma aplicacao web", c2, u2);
		 * 
		 * this.tr.save(top); this.tr.save(top1); this.tr.save(top2);
		 */
	}

}
