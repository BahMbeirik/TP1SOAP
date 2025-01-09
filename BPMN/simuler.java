import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngineConfiguration;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.history.HistoricActivityInstance;
import org.camunda.bpm.engine.history.HistoricProcessInstance;
import org.camunda.bpm.engine.runtime.ProcessInstance;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProcessSimulation {

    public static void main(String[] args) {
        // Configuration du moteur Camunda
        ProcessEngine processEngine = ProcessEngineConfiguration
                .createStandaloneInMemProcessEngineConfiguration()
                .buildProcessEngine();

        RuntimeService runtimeService = processEngine.getRuntimeService();

        // Simuler 100 instances du processus
        for (int i = 0; i < 100; i++) {
            // Variables pour la simulation
            Map<String, Object> variables = new HashMap<>();
            variables.put("employeeId", "emp" + i);
            variables.put("duration", i % 5 + 1); // Durée aléatoire entre 1 et 5 jours
            variables.put("approved", i % 2 == 0); // Alternance entre approuvé et rejeté

            // Démarrer une instance du processus
            ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("Process_DemandeConge", variables);
            System.out.println("Instance démarrée : " + processInstance.getId());
        }

        // Analyser les performances
        analyzePerformance(processEngine);
    }

    private static void analyzePerformance(ProcessEngine processEngine) {
        // Récupérer les instances historiques
        List<HistoricProcessInstance> historicProcessInstances = processEngine.getHistoryService()
                .createHistoricProcessInstanceQuery()
                .list();

        // Mesurer le temps d'exécution de chaque tâche
        for (HistoricProcessInstance instance : historicProcessInstances) {
            System.out.println("Process Instance ID: " + instance.getId());
            System.out.println("Start Time: " + instance.getStartTime());
            System.out.println("End Time: " + instance.getEndTime());
            System.out.println("Duration: " + (instance.getDurationInMillis() / 1000) + " seconds");

            // Récupérer les activités historiques
            List<HistoricActivityInstance> activities = processEngine.getHistoryService()
                    .createHistoricActivityInstanceQuery()
                    .processInstanceId(instance.getId())
                    .list();

            for (HistoricActivityInstance activity : activities) {
                System.out.println("  Activity: " + activity.getActivityName());
                System.out.println("  Start Time: " + activity.getStartTime());
                System.out.println("  End Time: " + activity.getEndTime());
                System.out.println("  Duration: " + (activity.getDurationInMillis() / 1000) + " seconds");
            }
        }
    }
}