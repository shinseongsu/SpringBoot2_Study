package com.example.oauth2.resourceserver.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class ResourceServerConfiguration {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.mvcMatcher("/samples/**")
                .authorizeRequests()
                .mvcMatchers("/samples/**")
                .access("hasAuthority('SCOPE_samples.read')")
                .and()
                .oauth2ResourceServer()
                .jwt();
        return http.build();
    }

}
