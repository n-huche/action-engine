package com.nhuche.tasks.classes;

import com.nhuche.tasks.classes.abstracts.Task;
import com.nhuche.tasks.interfaces.Lifecycle;
import com.nhuche.tasks.interfaces.Cadence;

public class RecurringIndependent extends Task implements Lifecycle, Cadence {

    private String cadence;
    private String doUntil;

    public RecurringIndependent(String goal, String action, String doOn, String doAt, String cadence, String doUntil) {
        super(goal, action, doOn, doAt);
        this.cadence = cadence;
        this.doUntil = doUntil;
    }

    
}  
