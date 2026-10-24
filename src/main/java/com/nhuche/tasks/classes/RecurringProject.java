package com.nhuche.tasks.classes;

import com.nhuche.tasks.classes.abstracts.Task;
import com.nhuche.tasks.interfaces.Lifecycle;
import com.nhuche.tasks.interfaces.Cadence;
import com.nhuche.tasks.interfaces.ProjectLink;

import java.util.Optional;

public class RecurringProject extends Task implements Lifecycle, Cadence, ProjectLink {

    private Optional<String> cadence;
    private Optional<String> doUntil;

    public RecurringProject(String goal, String action, Optional<String> doOn, Optional<String> doAt, Optional<String> cadence, Optional<String> doUntil) {
        super(goal, action, doOn, doAt);
        this.cadence = cadence;
        this.doUntil = doUntil;
    }
}
