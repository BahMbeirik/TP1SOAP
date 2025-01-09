package Exercice8;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceClient {
    @PostMapping("/demande-retour")
    public String traiterDemandeRetour(@RequestBody String demande) {
        // Vérifier la demande
        boolean demandeValide = true; // Exemple simple
        if (demandeValide) {
            return "{\"etiquetteRetour\": \"ABC123\"}";
        } else {
            return "{\"erreur\": \"Demande invalide\"}";
        }
    }
}