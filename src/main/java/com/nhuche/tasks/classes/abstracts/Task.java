package com.nhuche.tasks.classes.abstracts;

abstract public class Task {
    private String goal;
    private String action;

    public Task(String goal, String action) {
        this.goal = goal;
        this.action = action;
    }
}
