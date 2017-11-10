package app.spring.forms.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.RequestMethod;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		// main
		// builds upon below
		http.authorizeRequests()
		// allow anyone to see home
		.antMatchers(HttpMethod.GET, "/security/home").permitAll()
		// lock other sites behind user roles and basic authentication
		.antMatchers("/security/**").hasAnyRole("USER")
		.antMatchers(HttpMethod.GET,"/security/secret").hasRole("USER")
		.antMatchers(HttpMethod.POST,"/security/secret").hasRole("ADMIN")
		.antMatchers("/security/admin").hasRole("ADMIN")
		.antMatchers("/security/forbidden").denyAll()
		.and()
		.httpBasic()
		;
		
		// allow anyone to access URLs
		// http.authorizeRequests().anyRequest().permitAll();
		
		// using basic http authentication for USER
//		http.authorizeRequests()
//		.antMatchers("/security/**").hasAnyRole("USER")
//		.and()
//		.httpBasic()
//		;
		
		// adding forbidden pages
//		http.authorizeRequests()
//		.antMatchers("/security/forbidden").denyAll()
//		.and()
//		.httpBasic()
//		;
		
		// restrict access to certain users
//		http.authorizeRequests()
//		.antMatchers("/security/admin").hasRole("ADMIN")
//		.and()
//		.httpBasic()
//		;
		
		
	}

	@Autowired
	protected void configureCredentials(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("user").password("abc").roles("USER")
		.and()
		.withUser("admin").password("123").roles("ADMIN", "USER");
		
	}

}
