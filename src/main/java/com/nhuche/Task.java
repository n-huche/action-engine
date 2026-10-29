package com.nhuche;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.time.LocalDate;
import java.time.LocalTime;

public class Task {
    private TaskType type;
    private String goal;
    private String action;
    private LocalDate doOn;
    private LocalTime doAt;
    private String doUntil;
    private String link;
    private String cadence;

    private Task(TaskType type, String goal){
        this.type = type;
        this.goal = goal;
    };

    public static Task create(TaskType type, String goal) {
        return new Task(type, goal);
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

    public Task doUntil(String doUntil) {
        this.doUntil = doUntil;
        return this;
    }

    public Task link(String link) {
        this.link = link;
        return this;
    }

    public Task cadence(String cadence) {
        this.cadence = cadence;
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

    public String getDoUntil() {
        return doUntil;
    }

    public String getLink() {
        return link;
    }

    public String getCadence() {
        return cadence;
    }
    
    public static List<Task> getTaskList() {
        return Collections.unmodifiableList(taskList);
    }
}
