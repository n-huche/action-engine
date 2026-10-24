package com.nhuche;

import com.nhuche.tasks.classes.TaskManager;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        TaskManager tasks = new TaskManager();
        tasks.addMaintenanceTask("Shower", "1. Go to the shower, 2. Wash myself, 3. Get out of the shower", Optional.empty(), Optional.empty(), Optional.of("Daily"));
        tasks.addUniqueIndependentTask("Fix the bike", "1. Go to the bike, 2. Fix the bike, 3. Get out of the bike", Optional.empty(), Optional.empty());
        tasks.addRecurringIndependentTask("Go to dentist", "1. Go to the dentist, 2. Get the teeth cleaned, 3. Get out of the dentist", Optional.empty(), Optional.empty(), Optional.of("Monthly"), Optional.empty());
        tasks.addUniqueProjectTask("Organize exam topics", "1. Go to the study, 2. Organize the exam topics, 3. Get out of the study", Optional.empty(), Optional.empty(), "Exam");
        tasks.addRecurringProjectTask("Study for the exam", "1. Go to the study, 2. Study for the exam, 3. Get out of the study", Optional.empty(), Optional.empty(), Optional.of("Monthly"), Optional.of("Exam Day"), "Exam");
        System.out.println(tasks.getTasks());
    }
}