package br.ufms.cpcx.reinaldo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("developer")
public class MinhaConfiguracao {

    @Bean
    public CommandLineRunner executar() {
        return args -> System.out.println("Ambiente de Developer");
    }
}
