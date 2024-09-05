package br.com.ruannarici.consolemusic;

import br.com.ruannarici.consolemusic.main.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsolemusicApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ConsolemusicApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Main main = new Main();
		main.run();
	}
}
