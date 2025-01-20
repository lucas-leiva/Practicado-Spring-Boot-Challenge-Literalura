package com.miproyectoAlura.apibooks.apibooks;

import com.miproyectoAlura.apibooks.apibooks.main.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.security.Principal;

@SpringBootApplication
public class ApiParaLibrosApplication implements CommandLineRunner {
	@Autowired
	private final Menu menu;

	public ApiParaLibrosApplication(Menu menu){
		this.menu = menu;
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiParaLibrosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		menu.mostrarMenu();
	}
}
