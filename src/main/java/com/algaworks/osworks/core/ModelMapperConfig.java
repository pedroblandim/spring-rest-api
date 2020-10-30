package com.algaworks.osworks.core;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

	// This configuration declares the ModelMapper dependency as a Bean to be used by Spring
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
}
