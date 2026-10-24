package com.nhuche.tasks.classes;

import com.nhuche.tasks.classes.abstracts.Task;
import com.nhuche.tasks.interfaces.Cadence;
import java.util.Optional;

public class Maintenance extends Task implements Cadence {

    private Optional<String> cadence;

    public Maintenance(String goal, String action, Optional<String> doOn, Optional<String> doAt, Optional<String> cadence) {
        super(goal, action, doOn, doAt);
        this.cadence = cadence;
    }
}
