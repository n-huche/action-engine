package com.nhuche.tasks.classes.abstracts;

import java.util.Optional;

abstract public class Task {
    protected String goal;
    protected String action;
    protected Optional<String> doOn;
    protected Optional<String> doAt;

    public Task(String goal, String action, Optional<String> doOn, Optional<String> doAt) {
        this.goal = goal;
        this.action = action;
        this.doOn = doOn;
        this.doAt = doAt;
    }
}
