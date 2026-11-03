# Action Engine Especification

## Tasks

There are 5 types of tasks:

- Unique Independent Tasks
- Unique Project Tasks
- Recurring Independent Tasks
- Recurring Project Tasks
- Maintenance Tasks

Tasks can have 6 different fields, 3 of them present in all task types, and other 3, just some of them, they are:

### Common 

#### Goal

Goal is the reason why action-engine was created, tasks are form in order to reach the defined goal.

A goal can be simple, reacheble with one independent task, or can be complex, requiring a project, which is composed with project tasks, which one with a simple goal.

#### Action

Action is the center of all action-engine, it leads to the goal of each task.

A action must procedural, step by step and completely concrete, the idea is leave nothing to be thought about at the moment of execution.

#### Window

Window is the designated time interval to do a task or project.

Only independent task as their own window, project tasks windows are designated for they linked project.

### Specific

#### Deadline

Deadline is a task field whitch states that the task as a end. Set the due date of unique tasks e the end of occurrences of reccuring tasks.

All task types have the deadline field, except for maintenance task type. Maintenance tasks are used for tasks that repeats it self indefinitely.

#### Link

Link is a task field whitch states that the task is linked to a project. They are tasks that the goal serves a grater goal, defined by the project goal. It does not have an end in itself.

Only Unique Project and Recurring Project tasks type have the link field.

#### Cadence

Cadence is a task field whitch states that the task have repeated occurrences between cadence intervals until the deadline or indefinitely. The day of each occurrence is the due date of each recurring task repetition.

Recurring task types and manteinances are the ones with cadence field. 

## Project

Projects exists for turn a complex goal into a reachable thing, goals that a independent task is not suficient to reach alone. 

They are compose of project tasks, diveded by stages, whitch stages responsable for a block or condition.

## Status

Each tasks, phase and project as their own status. The possible status are:

### Completed

Here comes all the completed deadline tasks, stages and projects.

### Overdue

Here comes deadline tasks, stages and projects which did reach their deadline and doesn't was completed yet.

### Pending

Here comes deadline tasks, stages and projects which didn't reach their deadline and doesn't was completed yet.

