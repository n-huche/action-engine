package com.nhuche.tasks.classes;

import com.nhuche.tasks.classes.abstracts.Task;
import com.nhuche.tasks.interfaces.Lifecycle;

public class UniqueIndependent extends Task implements Lifecycle {
    public UniqueIndependent(String goal, String action, Optional<String> doOn, Optional<String> doAt) {
        super(goal, action, doOn, doAt);
    }
}
