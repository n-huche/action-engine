# DR-004: Where define mandatory task attributes

## Context

Tasks as mandatory attributes such as type and goal for all task types, link for project tasks and cadence and doUntil for recurring tasks, I have to decide if all attributes will still be decided with individual methods or if all or some of them will be decide as factory arguments.

## Options

1. Stay setting everything with individual methods. Simetric, simple, JSON friendly, but leaving mandatory attributes empty causes runtime exception.
2. Only attributes that are mandatory in all types of tasks setting in factory method. In case of non-definition causes Compilation Error instead of Runtime Exception, but don't covers mandatority in project or recurring task types.
3. Factory accepting different quantity of arguments covering for each task type mantory attributes. Covers all types of tasks causing non-definition causes Compilation Error instead of Runtime Exception, but results in a more non-intuitive API.
4. A factoty method to each task type, each requiring their own mandatory attributes as args. Compilation Error instead of Runtime Exception for each, intuitive, but a more complex code and database.

## Decision

Option 2. Best balance between a fail-fast code and code complexity.

## Consequences

- Still is require verify if factory args are null or empty.
- Non-definition of type and goal causes Compilation Error instead of Runtime Exception.
- Non-definition of cadence, doUntil or link in recurring and project tasks types still causes Runtime Exception.