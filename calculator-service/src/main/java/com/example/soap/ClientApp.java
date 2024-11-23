

import com.example.soap.client.CalculatorService;
import com.example.soap.client.Calculator;


public class ClientApp {
    public static void main(String[] args) {
        CalculatorService service = new CalculatorService();
        Calculator port = service.getCalculatorPort();

        System.out.println("Addition: " + port.add(5, 3));
        System.out.println("Subtraction: " + port.subtract(10, 7));
    }
}
