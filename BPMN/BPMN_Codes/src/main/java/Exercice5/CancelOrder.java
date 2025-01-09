package Exercice5;


import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CancelOrder implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) {
        System.out.println("Commande annulée : " + execution.getVariable("orderId"));
    }
}
