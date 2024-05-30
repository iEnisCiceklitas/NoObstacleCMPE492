package com.example.noObstacleProject.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authz -> authz
                        .requestMatchers("/api/users/**").permitAll()  // Tüm kullanıcı endpoint'lerine izin ver
                        .anyRequest().authenticated()  // Diğer tüm istekler için kimlik doğrulaması gerekir
                )
                .csrf().disable()  // CSRF korumasını devre dışı bırak
                .formLogin().disable()  // Form girişini devre dışı bırak
                .httpBasic().disable();  // HTTP Basic kimlik doğrulamasını devre dışı bırak
        return http.build();
    }
}
