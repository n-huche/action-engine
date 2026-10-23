package com.nhuche.tasks.classes;

import com.nhuche.tasks.classes.abstracts.Task;
import com.nhuche.tasks.interfaces.Lifecycle;
import com.nhuche.tasks.interfaces.Cadence;
import com.nhuche.tasks.interfaces.ProjectLink;

public class RecurringProject extends Task implements Lifecycle, Cadence, ProjectLink {
    public RecurringProject(String goal, String action) {
        super(goal, action);
    }
}
