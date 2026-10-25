# ADR 003: Redesign Code

## Context

The way I intended to structure the code was to have a class for each task type and to create a task entirely through its constructor. This would allow modularity, but it was not working out as expected. Some definitions, especially related to the cadence type of recurring tasks, could change the quantity of arguments required for creating a task. Beyond that, define all properties of a task in the constructor seemed to be too much of a burden.

## Options

- Use varargs for the constructor. This would allow for a flexible number of arguments, but it would be difficult to type check the arguments.

- Not define all properties of a task in the constructor, just the ones that are initially required. This would allow for more flexibility, but seems like a lot of boilerplate code.

- Set each property of a task as a separate method, like a pipeline. This would allow for more flexibility, but would require a design change to the task classes.

## Decision

I will use the third option, and also set all task types in only one class.

## Consequences

- Redesigning the task classes to support the new approach.
- A more complex single class.