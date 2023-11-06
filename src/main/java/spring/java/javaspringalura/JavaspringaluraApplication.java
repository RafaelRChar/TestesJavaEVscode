package spring.java.javaspringalura;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import spring.java.javaspringalura.model.DadosSerie;
import spring.java.javaspringalura.service.ConsumoAPI;
import spring.java.javaspringalura.service.ConverteDados;

@SpringBootApplication
public class JavaspringaluraApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JavaspringaluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Spring, sem boot, ou quase");
		ConsumoAPI apiConsumir = new ConsumoAPI();
		var jsonRespostaTemporario = apiConsumir.obterDados("https://www.omdbapi.com/?t=matrix&apikey=18f542e8");
		//System.out.println(jsonRespostaTemporario);
		//jsonRespostaTemporario = apiConsumir.obterDados("https://coffee.alexflipnote.dev/random.json");
		//System.out.println(jsonRespostaTemporario);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(jsonRespostaTemporario, DadosSerie.class);
		System.out.println(dados);
	}

}
