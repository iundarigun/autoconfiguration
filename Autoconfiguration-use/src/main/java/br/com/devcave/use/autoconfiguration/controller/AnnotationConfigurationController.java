package br.com.devcave.use.autoconfiguration.controller;

import br.com.devcave.config.autoconfiguration.domain.MessageToWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnnotationConfigurationController {

    @Autowired(required = false)
    @Qualifier("annotationMessageToWorld")
    private MessageToWorld annotationMessageToWorld;

    @GetMapping("annotation")
    public ResponseEntity<?> getAnnotationHelloworldMessage() {
        return ResponseEntity.ok(
                annotationMessageToWorld == null
                        ? "NO BEAN"
                        : annotationMessageToWorld.getMessage());
    }

}
