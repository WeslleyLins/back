package br.com.devweslley.aplicand;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AplicandApplication {

	public static void main(String[] args) {
		SpringApplication.run(AplicandApplication.class, args);
	}

		@Bean
		public ModelMapper modelMapper() {
			ModelMapper modelMapper = new ModelMapper();
			modelMapper.getConfiguration().setAmbiguityIgnored(true);

			return modelMapper;
		}
}