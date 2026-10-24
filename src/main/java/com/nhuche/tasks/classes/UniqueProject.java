package com.nhuche.tasks.classes;

import com.nhuche.tasks.classes.abstracts.Task;
import com.nhuche.tasks.interfaces.Lifecycle;
import com.nhuche.tasks.interfaces.ProjectLink;

import java.util.Optional;

public class UniqueProject extends Task implements Lifecycle, ProjectLink {
    public UniqueProject(String goal, String action, Optional<String> doOn, Optional<String> doAt) {
        super(goal, action, doOn, doAt);
    }
}
