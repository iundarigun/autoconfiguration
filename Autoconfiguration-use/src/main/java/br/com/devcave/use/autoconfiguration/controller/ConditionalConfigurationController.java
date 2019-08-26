package br.com.devcave.use.autoconfiguration.controller;

import br.com.devcave.config.autoconfiguration.domain.MessageToWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConditionalConfigurationController {

    @Autowired(required = false)
    @Qualifier("conditionalMessageToWorld")
    private MessageToWorld conditionalMessageToWorld;

    @GetMapping("conditional")
    public ResponseEntity<?> getConditionalHelloworldMessage() {
        return ResponseEntity.ok(
                conditionalMessageToWorld == null
                        ? "NO BEAN"
                        : conditionalMessageToWorld.getMessage());
    }

}
