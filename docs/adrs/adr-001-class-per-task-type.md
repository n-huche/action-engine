# ADR 001 - Class per task type

## Context

I need to create a task management system that can handle different types of tasks, each with its own unique properties and behaviors.

## Options

- One class per task type. Would probably cause code duplication, but would be easy to set up for each task type

- One class for all task types. Would be more consise, but would be more complex to set up for each task type.

- One class for each task type and a base abstract class for the common properties and behaviors. Best of both worlds, but can be complex to maintain.

## Decision

I will use one class for each task type and a base abstract class for the common properties and behaviors.

## Consequences

- I will need to carefully distribute responsibilities between the abstract class and the classes for each task type.