package br.edu.infnet.projetodebloco.heroigen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class HeroiGenApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeroiGenApplication.class, args);
	}

}
