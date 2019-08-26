package br.com.devcave.use.autoconfiguration.controller;

import br.com.devcave.config.autoconfiguration.domain.MessageToWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManualConfigurationController {

    @Autowired(required = false)
    @Qualifier("manualMessageToWorld")
    private MessageToWorld manualMessageToWorld;

    @GetMapping("manual")
    public ResponseEntity<?> getManualHelloworldMessage() {
        return ResponseEntity.ok(
                manualMessageToWorld == null
                        ? "NO BEAN"
                        : manualMessageToWorld.getMessage());
    }
}
