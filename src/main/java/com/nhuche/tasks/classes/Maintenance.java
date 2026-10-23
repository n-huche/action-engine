package com.nhuche.tasks.classes;

import com.nhuche.tasks.classes.abstracts.Task;
import com.nhuche.tasks.interfaces.Cadence;

public class Maintenance extends Task implements Cadence {
    public Maintenance(String goal, String action) {
        super(goal, action);
    }
}
