package com.nhuche;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.time.*;

public class Task {
    private TaskType type;
    private String goal;
    private String action;
    private LocalTime doAt;
    private LocalDate doOn;
    private LocalDate doUntil;
    private Cadence cadence;
    private String link;

    private Task(TaskType type, String goal){
        this.type = type;
        this.goal = goal;
    };

    public static Task create(TaskType type, String goal) {
        Task task = new Task(type, goal);
        return task;
    }

    private static List<Task> taskList = new ArrayList<>();

    @Override
    public String toString() {
        return goal;
    }

    /////////////////////
    /// TASK CREATION ///
    /////////////////////

    public Task action(String action) {
        this.action = action;
        return this;
    }

    public Task doOn(LocalDate doOn) {
        this.doOn = doOn;
        return this;
    }

    public Task doAt(LocalTime doAt) {
        this.doAt = doAt;
        return this;
    }

    public Task link(String link) {
        if(!(type == TaskType.UNIQUE_PROJECT || type == TaskType.RECURRING_PROJECT)) {
            throw new NoProjectTaskFoundException();
        }
        this.link = link;
        return this;
    }

    public Task doUntil(LocalDate doUntil) {
        this.doUntil = doUntil;
        return this;
    }

    public Task cadence(Cadence cadence) {
        this.cadence = cadence;

        switch (cadence) {
            case Cadence.Daily daily -> { }
            case Cadence.Weekdays weekdays -> {
                DayOfWeek[] days = weekdays.days();
            }
            case Cadence.Monthdays monthdays -> {
                int[] days = monthdays.days();
            }
            case Cadence.Monthweeks monthweeks -> {
                DayOfWeek day = monthweeks.day();
            }
        }

        return this;
    }

    public Task add() {
        if (type == null) {
            throw new TaskTypeNotDefinedException();
        }
        if (goal == null || goal.isBlank()) {      
            throw new GoalNotDefinedException();
        }
  
        taskList.add(this);
        return this;
    }

    ///////////////////
    /// GET METHODS ///
    ///////////////////

    public TaskType getType() {
        return type;
    }

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
