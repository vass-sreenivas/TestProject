package com.example.main;

import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;

public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter{

	 // Create 2 users for demo
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()
                .withUser("user").password("{noop}password").authorities("ROLE_USER")
                .and()
                .withUser("admin").password("{noop}password").authorities("ROLE_USER,ROLE_ADMIN");

    }

    // Secure the endpoins with HTTP Basic authentication
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        
                //HTTP Basic authentication
                http
                .httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, "/emp/**").access("hasRole('ROLE_USER')")
                .antMatchers(HttpMethod.POST, "/emp").access("hasRole('ROLE_USER')")
                .antMatchers(HttpMethod.PUT, "/emp").access("hasRole('ROLE_USER')")
                .antMatchers(HttpMethod.DELETE, "/emp/**").access("hasRole('ROLE_ADMIN')")
                .and()
                .csrf().disable()
                .formLogin().disable();
    }
}
