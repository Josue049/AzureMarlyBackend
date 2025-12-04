package com.marly.handmade.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
    @Bean
    public WebMvcConfigurer corsConfig() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("*")   // permite todos los dominios
                        .allowedMethods("*")   // permite todos los métodos HTTP
                        .allowedHeaders("*")   // permite todas las cabeceras
                        .allowCredentials(false);
            }
        };
    }
}