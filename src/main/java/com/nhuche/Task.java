package com.nhuche;

import java.util.List;
import java.util.ArrayList;

import java.util.Collections;

public class Task {
    private String type;
    private String goal;
    private String action;
    private String doOn;
    private String doAt;
    private String doUntil;
    private String link;
    private String cadence;

    public Task(){};

    private static List<Task> taskList = new ArrayList<>();

    @Override
    public String toString() {
        return goal;
    }

    /////////////////////
    /// TASK CREATION ///
    /////////////////////

    public void type(String type) {
        this.type = type;
    }

    public void goal(String goal) {
        this.goal = goal;
    }

    public void action(String action) {
        this.action = action;
    }

    public void doOn(String doOn) {
        this.doOn = doOn;
    }

    public void doAt(String doAt) {
        this.doAt = doAt;
    }

    public void doUntil(String doUntil) {
        this.doUntil = doUntil;
    }

    public void link(String link) {
        this.link = link;
    }

    public void cadence(String cadence) {
        this.cadence = cadence;
    }

    public void add() {
        if (goal == null) {      
            throw new GoalNotDefinedException();
        }
        taskList.add(this);
    }

    ///////////////////
    /// GET METHODS ///
    ///////////////////

    public String getType() {
        return type;
    }

    public String getGoal() {
        return goal;
    }

    public String getAction() {
        return action;
    }

    public String getDoOn() {
        return doOn;
    }

    public String getDoAt() {
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
