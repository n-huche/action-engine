# ADR-002: Single Source of Truth

## Context

Created tasks must be stored, and just one storage form must be the source of truth.

## Options

1. SQL database. Conventional, easy data manipulation.
2. Markdown. Convenient for AI, more difficult data manipulation.

## Decision

Option 1. It is the most conventional way to store data, and preventing improper edits to Markdown files from breaking the system would introduce additional complexity. 

## Consequences

- Markdown files still need to be created as a reflection of database's truth.
- Tasks real state can't be manipulated in an IDE.