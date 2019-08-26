package br.com.devcave.config.autoconfiguration.starter;

import br.com.devcave.config.autoconfiguration.domain.MessageToWorld;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class HelloWorld {

    @Value("${devcave.autoconfiguration.starter.message:}")
    private String message;

    @Bean("starterMessageToWorld")
    public MessageToWorld starterMessageToWorld() {
        log.info("creating bean 'starterMessageToWorld'");
        return new MessageToWorld(message);
    }
}
