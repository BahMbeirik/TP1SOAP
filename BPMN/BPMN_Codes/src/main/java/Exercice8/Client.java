package Exercice8;

import org.springframework.web.client.RestTemplate;

public class Client {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String demandeRetour = "{\"produitId\": \"123\", \"raison\": \"défectueux\"}";
        String response = restTemplate.postForObject("http://localhost:8080/service-client/demande-retour", demandeRetour, String.class);
        System.out.println("Réponse du service client : " + response);
    }
}