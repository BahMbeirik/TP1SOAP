package Exercice7;

import javax.jws.WebService;

@WebService
public class DiscountService {
    public double calculateDiscount(String customerHistory) {
        return customerHistory.contains("10 orders") ? 0.15 : 0.05; // Exemple logique
    }
}
