package com.nhuche;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.time.*;

public class Task {
    private String goal;
    private String action;
    private LocalTime doAt;
    private LocalDate doOn;
    private LocalDate doUntil;
    private Cadence cadence;
    private String link;

    // Unique Indepent Task
    private Task(String goal, String action, LocalTime doAt, LocalDate doOn){
        this.goal = goal;
        this.action = action;
        this.doAt = doAt;
        this.doOn = doOn;
    };

    // Unique Project Task
    private Task(String goal, String action, String link, LocalTime doAt, LocalDate doOn){
        this.goal = goal;
        this.action = action;
        this.link = link;
        this.doAt = doAt;
        this.doOn = doOn;
    };

    // Recurring Independent Task
    private Task(String goal, String action, LocalTime doAt, LocalDate doOn, LocalDate doUntil, Cadence cadence){
        this.goal = goal;
        this.action = action;
        this.doAt = doAt;
        this.doOn = doOn;
        this.doUntil = doUntil;
        this.cadence = cadence;
    };

    // Recurring Project Task
    private Task(String goal, String action, String link, LocalTime doAt, LocalDate doOn, LocalDate doUntil, Cadence cadence){
        this.goal = goal;
        this.action = action;
        this.link = link;
        this.doAt = doAt;
        this.doOn = doOn;
        this.doUntil = doUntil;
        this.cadence = cadence;
    };

    // Manteinance
    private Task(String goal, String action, LocalTime doAt, LocalDate doOn, Cadence cadence){
        this.goal = goal;
        this.action = action;
        this.doAt = doAt;
        this.doOn = doOn;
        this.cadence = cadence;
    };

    public static Task create(TaskInterface newTask) {
        switch (newTask) {
            case TaskInterface.UniqueIndependent task -> {
                return new Task(task.goal(), task.action(), task.doAt(), task.doOn());
            }
            case TaskInterface.UniqueProject task -> {
                return new Task(task.goal(), task.action(), task.link(), task.doAt(), task.doOn());
            }
            case TaskInterface.RecurringIndependent task -> {
                return new Task(task.goal(), task.action(), task.doAt(), task.doOn(), task.doUntil(), task.cadence());
            }
            case TaskInterface.RecurringProject task -> {
                return new Task(task.goal(), task.action(), task.link(), task.doAt(), task.doOn(), task.doUntil(), task.cadence());
            }
            case TaskInterface.Manteinance task -> {
                return new Task(task.goal(), task.action(), task.doAt(), task.doOn(), task.cadence());
            }
        }
    }

    private static List<Task> taskList = new ArrayList<>();

    @Override
    public String toString() {
        return goal;
    }

    ///////////////////
    /// GET METHODS ///
    ///////////////////

    public String getGoal() {
        return goal;
    }

    public String getAction() {
        return action;
    }

    public LocalDate getDoOn() {
        return doOn;
    }

    public LocalTime getDoAt() {
        return doAt;
    }

    public String getLink() {
        return link;
    }

    public LocalDate getDoUntil() {
        return doUntil;
    }

    public Cadence getCadence() {
        return cadence;
    }
    
    public static List<Task> getTaskList() {
        return Collections.unmodifiableList(taskList);
    }
}
