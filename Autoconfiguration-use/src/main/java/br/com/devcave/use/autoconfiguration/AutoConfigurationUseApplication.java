package br.com.devcave.use.autoconfiguration;

import br.com.devcave.config.autoconfiguration.annotation.EnableHelloWorld;
import br.com.devcave.config.autoconfiguration.manual.HelloWorld;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@EnableHelloWorld
@SpringBootApplication
@Import(HelloWorld.class)
public class AutoConfigurationUseApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoConfigurationUseApplication.class, args);
	}

}
