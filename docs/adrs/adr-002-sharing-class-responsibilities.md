# ADR 002 - Sharing class responsibilities

## Context

There are features that all task types share, and others that are shared only by some. For example:

- All tasks have an objective, an action, and a date and time for completion.
- Unique tasks are the only ones that need to be performed just once.
- Only maintenance tasks lack a defined end point.

I have to decide how to share these responsibilities between classes.

## Options

- All task types inherit from the abstract superclass only the functionality that they all share, while I reimplement, within the specific type classes, the functionality that is shared only among some of them. More flexible, more complex to maintain.

- Write all the functionality for every task in the abstract superclass, and leave them unused in the classes for types that do not require them. More maintainable, less flexible.

- Create new classes that implement responsibilities shared by only some task types. Easier maintenance, more complex structure.

## Decision

I will use the first option and implement interfaces for the functionality that is shared only by some task types.

## Consequences

- The superclass will only contain the functionality that all task types share.
- I will implement interfaces for the functionality that is shared only by some task types.
- I will have to rewrite some code.
