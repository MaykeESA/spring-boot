package br.com.alura.forum.controller.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class LoginForm {

	@NotNull @NotEmpty @NotBlank @Size(min = 7)
	private String email;
	@NotNull @NotEmpty @NotBlank @Size(min = 7)
	private String senha;

	public LoginForm(String email, String senha) {
		this.email = email;
		this.senha = senha;
	}
	
	public UsernamePasswordAuthenticationToken converter(){
		return new UsernamePasswordAuthenticationToken(this.email, this.senha);
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

}
