package com.nhuche.tasks.classes;

import java.util.List;
import java.util.ArrayList;
import com.nhuche.tasks.classes.abstracts.Task;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addMaintenanceTask(String goal, String action, String doOn, String doAt, String cadence) {
        tasks.add(new Maintenance(goal, action, doOn, doAt, cadence));
    }

    public void addUniqueIndependentTask(String goal, String action, String doOn, String doAt) {
        tasks.add(new UniqueIndependent(goal, action, doOn, doAt));
    }

    public void addRecurringIndependentTask(String goal, String action, String doOn, String doAt, String cadence, String doUntil) {
        tasks.add(new RecurringIndependent(goal, action, doOn, doAt, cadence, doUntil));
    }

    public void addUniqueProjectTask(String goal, String action, String doOn, String doAt, String phase) {
        tasks.add(new UniqueProject(goal, action, doOn, doAt, phase));
    }

    public void addRecurringProjectTask(String goal, String action, String doOn, String doAt, String cadence, String doUntil, String phase) {
        tasks.add(new RecurringProject(goal, action, doOn, doAt, cadence, doUntil, phase));
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
