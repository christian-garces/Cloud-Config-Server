package com.gonzalez.usuario.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("microservicio-usuarios")
@org.springframework.context.annotation.Configuration
public class Configuration {
	private String value;
	
	public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}