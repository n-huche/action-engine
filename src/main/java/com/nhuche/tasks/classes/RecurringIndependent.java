package com.nhuche.tasks.classes;

import com.nhuche.tasks.classes.abstracts.Task;
import com.nhuche.tasks.interfaces.Lifecycle;
import com.nhuche.tasks.interfaces.Cadence;

import java.util.Optional;

public class RecurringIndependent extends Task implements Lifecycle, Cadence {

    private String goal;
    private String action;
    private Optional<String> doOn;
    private Optional<String> doAt;
    private Optional<String> doUntil;
    private Optional<String> cadence;

    public RecurringIndependent(String goal, String action, Optional<String> doOn, Optional<String> doAt, Optional<String> doUntil, Optional<String> cadence) {
        super(goal, action);
        this.goal = goal;
        this.action = action;
        this.doOn = doOn;
        this.doAt = doAt;
        this.doUntil = doUntil;
        this.cadence = cadence;
    }
}
