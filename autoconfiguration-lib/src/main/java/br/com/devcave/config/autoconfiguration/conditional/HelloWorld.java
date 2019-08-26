package br.com.devcave.config.autoconfiguration.conditional;

import br.com.devcave.config.autoconfiguration.domain.MessageToWorld;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

@Slf4j
@ConditionalOnMissingBean(type="br.com.devcave.use.autoconfiguration.config.BeanMessage")
public class HelloWorld {

    @Value("${devcave.autoconfiguration.conditional.message:}")
    private String message;

    @Bean("conditionalMessageToWorld")
    public MessageToWorld conditionalMessageToWorld() {
        log.info("creating bean 'conditionalMessageToWorld'");
        return new MessageToWorld(message);
    }

}
