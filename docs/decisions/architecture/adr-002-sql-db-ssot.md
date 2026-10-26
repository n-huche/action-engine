# ADR-002: Single Source of Truth

## Context

Created tasks must be stored, and just one storage form must be the source of truth.

## Options

1. SQL database. Convencional, easy data manipulation.
2. Markdown. Convenient for AI, most difficult data manipulation.

## Decision

Option 1.

## Consequences

- Markdown files still need to be created as a reflex of database's truth.
- Tasks real state can't be manipulate in an IDE.