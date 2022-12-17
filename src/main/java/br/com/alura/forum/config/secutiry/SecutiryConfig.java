package br.com.alura.forum.config.secutiry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SuppressWarnings("deprecation")
@EnableWebSecurity
@Configuration
public class SecutiryConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private UserDetailsService autenticacaoService;
	
	//Configuracoes de autenticacao
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(this.autenticacaoService).passwordEncoder(new BCryptPasswordEncoder());
	}
	
	//Configuracaoes de autorizacao
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers(HttpMethod.GET, "/topicos").permitAll()
		.antMatchers(HttpMethod.GET, "/topico/*").permitAll()
		.anyRequest().authenticated()
		.and().formLogin();
	}
	
	//Configuracoes de recursos estaticos(Js, CSS, etc...)
	@Override
	public void configure(WebSecurity web) throws Exception {
	}
	
}