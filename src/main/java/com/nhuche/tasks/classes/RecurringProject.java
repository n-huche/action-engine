package com.nhuche.tasks.classes;

import com.nhuche.tasks.classes.abstracts.Task;
import com.nhuche.tasks.interfaces.Lifecycle;
import com.nhuche.tasks.interfaces.Cadence;
import com.nhuche.tasks.interfaces.ProjectLink;

public class RecurringProject extends Task implements Lifecycle, Cadence, ProjectLink {

    private String cadence;
    private String doUntil;
    private String phase;

    public RecurringProject(String goal, String action, String doOn, String doAt, String cadence, String doUntil, String phase) {
        super(goal, action, doOn, doAt);
        this.cadence = cadence;
        this.doUntil = doUntil;
        this.phase = phase;
    }
}
