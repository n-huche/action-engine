# DR-003: Classes in methods arguments

## Context

In need to define what classes will be used as arguments in the task methods.

## Options

1. Strings. Simple, convenient for users output, but would be necessary convert the String object to the object of the used Class in the code.
2. Strong typing, the argument class being the same used for the code process. More direct, but would be necessary convert users output before call the method.

## Decision

Option 2. In that way invalid format causes a Compilation Error. Invalid format in option 1 would cause runtime exception. Error before compilation is preferable.

## Consequences

- I probably will need to create a parser to handling JSON formats.