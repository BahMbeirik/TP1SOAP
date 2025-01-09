package Exercice5;


import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class DiscountRule implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) {
        Double amount = (Double) execution.getVariable("orderAmount");
        if (amount > 1000) {
            execution.setVariable("discountApplied", true);
            execution.setVariable("finalAmount", amount * 0.9); // 10% reduction
        } else {
            execution.setVariable("discountApplied", false);
            execution.setVariable("finalAmount", amount);
        }
    }
}
