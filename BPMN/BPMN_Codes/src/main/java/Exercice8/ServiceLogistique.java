package Exercice8;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceLogistique {
    @PostMapping("/organiser-collecte")
    public String organiserCollecte(@RequestBody String etiquette) {
        // Organiser la collecte
        return "{\"confirmation\": \"Collecte organisée\"}";
    }
}