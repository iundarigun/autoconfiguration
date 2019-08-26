package br.com.devcave.config.autoconfiguration.annotation;

import br.com.devcave.config.autoconfiguration.domain.MessageToWorld;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class HelloWorld {

    @Value("${devcave.autoconfiguration.annotation.message:}")
    private String message;

    @Bean("annotationMessageToWorld")
    public MessageToWorld annotationMessageToWorld() {
        log.info("creating bean 'annotationMessageToWorld'");
        return new MessageToWorld(message);
    }

}
