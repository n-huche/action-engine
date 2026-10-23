package com.nhuche.tasks.classes;

import com.nhuche.tasks.classes.abstracts.Task;
import com.nhuche.tasks.interfaces.Lifecycle;
import com.nhuche.tasks.interfaces.Cadence;

public class RecurringIndependent extends Task implements Lifecycle, Cadence {
    public RecurringIndependent(String goal, String action) {
        super(goal, action);
    }
}
