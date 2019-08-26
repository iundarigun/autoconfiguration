package br.com.devcave.config.autoconfiguration.manual;

import br.com.devcave.config.autoconfiguration.domain.MessageToWorld;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class HelloWorld {

    @Value("${devcave.autoconfiguration.manual.message:}")
    private String message;

    @Bean("manualMessageToWorld")
    public MessageToWorld manualMessageToWorld() {
        log.info("creating bean 'manualMessageToWorld'");
        return new MessageToWorld(message);
    }

}
