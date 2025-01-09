package Exercice7;

import javax.jws.WebService;

@WebService
public class OrderService {
    public String confirmOrder(String productId, int quantity, double discount) {
        return "Commande confirmée avec une remise de " + (discount * 100) + "%.";
    }
}
