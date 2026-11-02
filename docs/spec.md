# Action Engine Especification

## Tasks

There are 5 types of tasks:

- Unique Independent Tasks
- Unique Project Tasks
- Recurring Independent Tasks
- Recurring Project Tasks
- Maintenance Tasks

Each task must have mandatorily 2 fields

Tasks can have 3 different fields, besides goal and due time, they are:

- Deadline
- Link
- Cadence

### Deadline

Deadline is a task field whitch states that the task as a end. Set the due date of unique tasks e the end of occurrences of reccuring tasks.

All task types have the deadline field, except for maintenance task type. Maintenance tasks are used for tasks that repeats it self indefinitely.

### Link

Link is a task field whitch states that the task is linked to a project. They are tasks that the goal serves a grater goal, defined by the project goal. It does not have an end in itself.

Only Unique Project and Recurring Project tasks type have the link field.

### Cadence

Cadence is a task field whitch states that the task have repeated occurrences between cadence intervals until the deadline or indefinitely. The day of each occurrence is the due date of each recurring task repetition.

Recurring task types and manteinances are the ones with cadence field. 

## Project

