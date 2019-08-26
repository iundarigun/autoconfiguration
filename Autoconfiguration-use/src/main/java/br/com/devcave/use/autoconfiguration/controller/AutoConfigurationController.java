package br.com.devcave.use.autoconfiguration.controller;

import br.com.devcave.config.autoconfiguration.domain.MessageToWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutoConfigurationController {

    @Autowired(required = false)
    @Qualifier("starterMessageToWorld")
    private MessageToWorld starterMessageToWorld;

    @GetMapping("starter")
    public ResponseEntity<?> getStarterHelloworldMessage() {
        return ResponseEntity.ok(
                starterMessageToWorld == null
                        ? "NO BEAN"
                        : starterMessageToWorld.getMessage());
    }
}
