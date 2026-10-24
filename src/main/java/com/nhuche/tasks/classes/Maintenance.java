package com.nhuche.tasks.classes;

import com.nhuche.tasks.classes.abstracts.Task;
import com.nhuche.tasks.interfaces.Cadence;

public class Maintenance extends Task implements Cadence {

    private String cadence;

    public Maintenance(String goal, String action, String doOn, String doAt, String cadence) {
        super(goal, action, doOn, doAt);
        this.cadence = cadence;
    }
}
