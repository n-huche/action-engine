package com.nhuche.tasks.classes;

import com.nhuche.tasks.classes.abstracts.Task;
import com.nhuche.tasks.interfaces.Lifecycle;
import com.nhuche.tasks.interfaces.Cadence;

import java.util.Optional;

public class RecurringIndependent extends Task implements Lifecycle, Cadence {

    private Optional<String> cadence;
    private Optional<String> doUntil;

    public RecurringIndependent(String goal, String action, Optional<String> doOn, Optional<String> doAt, Optional<String> cadence, Optional<String> doUntil) {
        super(goal, action, doOn, doAt);
        this.cadence = cadence;
        this.doUntil = doUntil;
    }

    
}  
