package com.nhuche.tasks.classes;

import com.nhuche.tasks.classes.abstracts.Task;
import com.nhuche.tasks.interfaces.Lifecycle;
import com.nhuche.tasks.interfaces.ProjectLink;

public class UniqueProject extends Task implements Lifecycle, ProjectLink {

    private String phase;
    
    public UniqueProject(String goal, String action, String doOn, String doAt, String phase) {
        super(goal, action, doOn, doAt);
        this.phase = phase;
    }
}
