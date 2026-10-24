package com.nhuche.tasks.classes;

import com.nhuche.tasks.classes.abstracts.Task;
import com.nhuche.tasks.interfaces.Cadence;

import java.util.Optional;

public class Maintenance extends Task implements Cadence {
    public Maintenance(String goal, String action, Optional<String> doOn, Optional<String> doAt) {
        super(goal, action, doOn, doAt);
    }
}
