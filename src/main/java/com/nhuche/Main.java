package com.nhuche;

import com.nhuche.tasks.classes.TaskManager;

public class Main {
    public static void main(String[] args) {
        TaskManager tasks = new TaskManager();
        tasks.addMaintenanceTask("Shower", "1. Go to the shower, 2. Wash myself, 3. Get out of the shower", null, null, "Daily");
        tasks.addUniqueIndependentTask("Fix the bike", "1. Go to the bike, 2. Fix the bike, 3. Get out of the bike", null, null);
        tasks.addRecurringIndependentTask("Go to dentist", "1. Go to the dentist, 2. Get the teeth cleaned, 3. Get out of the dentist", null, null, "Monthly", null);
        tasks.addUniqueProjectTask("Organize exam topics", "1. Go to the study, 2. Organize the exam topics, 3. Get out of the study", null, null, "Exam");
        tasks.addRecurringProjectTask("Study for the exam", "1. Go to the study, 2. Study for the exam, 3. Get out of the study", null, null, "Monthly", "Exam Day", "Exam");
        System.out.println(tasks.getTasks());
    }
}