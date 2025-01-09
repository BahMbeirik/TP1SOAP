package Exercice7;

import javax.jws.WebService;

@WebService
public class CustomerService {
    public String getCustomerInfo(String customerId) {
        return "<Customer><Name>Jean Dupont</Name><Email>jean.dupont@example.com</Email><History>10 orders</History></Customer>";
    }
}
