package com.nhuche.tasks.classes;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import com.nhuche.tasks.classes.abstracts.Task;

public class Tasks {
    public static List<Task> tasks = new ArrayList<>();

    public static void addMaintenanceTask(String goal, String action, Optional<String> doOn, Optional<String> doAt, Optional<String> cadence) {
        tasks.add(new Maintenance(goal, action, doOn, doAt, cadence));
    }

    public static void addUniqueIndependentTask(String goal, String action, Optional<String> doOn, Optional<String> doAt) {
        tasks.add(new UniqueIndependent(goal, action, doOn, doAt));
    }

    public static void addRecurringIndependentTask(String goal, String action, Optional<String> doOn, Optional<String> doAt, Optional<String> cadence, Optional<String> doUntil) {
        tasks.add(new RecurringIndependent(goal, action, doOn, doAt, cadence, doUntil));
    }

    public static void addUniqueProjectTask(String goal, String action, Optional<String> doOn, Optional<String> doAt, String phase) {
        tasks.add(new UniqueProject(goal, action, doOn, doAt, phase));
    }

    public static void addRecurringProjectTask(String goal, String action, Optional<String> doOn, Optional<String> doAt, Optional<String> cadence, Optional<String> doUntil, String phase) {
        tasks.add(new RecurringProject(goal, action, doOn, doAt, cadence, doUntil, phase));
    }
}
