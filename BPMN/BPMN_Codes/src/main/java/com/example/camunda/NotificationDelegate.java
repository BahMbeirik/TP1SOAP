package com.example.camunda;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class NotificationDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) {
        String status = (String) execution.getVariable("approvalStatus");
        if ("approved".equals(status)) {
            System.out.println("Notification : Demande approuvée !");
        } else {
            System.out.println("Notification : Demande rejetée !");
        }
    }
}
