# DR-002: Class Redesign

## Context

The way I intended to design classes and initialize tasks proved, fortunately from the very beginning, to be unnecessarily complicated. I intended to initialize tasks using constructors, but some definitions, especially related to the cadence type of recurring tasks, could change the quantity of arguments required for creating a task. Beyond that, defining all properties of a task in the constructor seemed to be too much of a burden.

## Options

- Use varargs for the constructor. This would allow for a flexible number of arguments, but it would be difficult to type check the arguments.
- Not define all properties of a task in the constructor, just the ones that are initially required. This would allow for more flexibility, but seems like a lot of boilerplate code.
- Set each property of a task as a separate method, like a pipeline. This would allow for more flexibility, but would require a design change to the task classes.

## Decision

I will use the third option, and also set all task types in only one class, reducing the complexity of the source code.

## Consequences

- Redesign the task class to support the new approach.
- A more complex single class.