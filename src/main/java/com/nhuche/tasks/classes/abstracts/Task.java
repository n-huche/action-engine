package com.nhuche.tasks.classes.abstracts;

abstract public class Task {
    protected String goal;
    protected String action;
    protected String doOn;
    protected String doAt;

    public Task(String goal, String action, String doOn, String doAt) {
        this.goal = goal;
        this.action = action;
        this.doOn = doOn;
        this.doAt = doAt;
    }

    @Override
    public String toString() {
        return goal;
    }
}
