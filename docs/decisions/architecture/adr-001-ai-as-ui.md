# ADR-001: User Interface

## Context

Action Engine must have an interface for the user be able to create, modify and mark tasks as done.

## Options

1. Web app with html, css and javascript. Introduces frontend, most conventional.
2. Markdown, obsidian as GUI. Simple to do, but complicate synchronization.
3. All through AI. Requires AI, but is simple to do.

## Decision

Third option. Enables the use of AI to quickly create tasks, and is align with the API design I have in mind.

## Consequences

- Markdown still required for AI context convenience.
- AI subscription or token credits required.
- MCP friendly API required.
