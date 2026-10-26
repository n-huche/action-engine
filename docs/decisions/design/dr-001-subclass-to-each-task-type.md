# DR-001: Initial class design

## Context

I need to create a task system that can handle different types of tasks, each with its own unique properties and behaviors. I must find out the most adequate class design for that.

## Options

1. One class per task type. Would probably cause code duplication, but would be easy to set up each task type
2. One class for all task types. Would be more concise, but would require verification steps to identify invalid tasks with incompatible properties.
3. One subclass for each task type and a base abstract superclass for the common properties and behaviors. Best of both worlds, but can be complex to maintain, and still some code duplication.

## Decision

I choose option 3. I will create a base abstract class for common behaviors and interfaces for behaviors that only some of the task types share.

## Consequences

- Need to carefully distribute responsibilities between the abstract class and the classes for each task type.
- Interfaces must have methods that all subclasses that implement it must have.
- Minimize the inevitable code duplication.