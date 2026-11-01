# DR-005: Single cadence class with static factories

## Context

Cadence is a task method that as it own types that need specific and different arguments. I must decide how I will implement it.

## Options

1. Cadence as a interface and each cadence type as a class or record that implements it. Its allow to tasks of the same cadence type share the same datatype, but seems like unecessary complexity.

2. Cadence as a class and each cadence type as a static method. Simple to implement, but weaker borders.

## Decision

Option 1. I this moment I doesn't antecipate any necessity to each cadence type have their own data type.

## Consequences

- More simple code
- Weaker division between cadence types.