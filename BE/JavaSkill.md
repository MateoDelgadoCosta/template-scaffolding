# Agent Skill: JAVA-CORE-ENGINEER

## 1. Frontmatter
- **Paradigm:** Spec-Driven Development (SDD)
- **Standard:** Java 21 LTS / Maven / JUnit 5 / Mockito
- **Objective:** Design and implementation of decoupled, optimized, and exhaustively tested Java systems.

## 2. Purpose & Context
This skill enables the agent to act as a proactive engineer. It prioritizes semantic naming, algorithmic efficiency (Big O), and extreme testability through dependency isolation.

## 3. Procedural Workflow

### Phase A: Skeptical Inquiry (Mandatory)
The agent MUST request:
1. **Input Scale ($n$):** To determine Big O requirements.
2. **Naming Context:** Any specific domain terminology for variables.
3. **Dependency Needs:** External libraries to be managed via Maven.

### Phase B: Infrastructure Design (SPEC)
Generate a technical report including:
- **Big O Analysis:** Performance justification.
- **Decoupling Strategy:** How layers (UI, Service, Repository) will be isolated for testing.
- **Collection Selection:** Choosing the specific Java 21 structure (e.g., `LinkedHashMap` for sequenced access).

### Phase C: Implementation (Purpose-Driven Code)
- Generate a Maven-compliant structure.
- **Semantic Naming:** Every variable must be named according to its role in the logic.
- **Record Usage:** Implementation of DTOs for data transport.

### Phase D: Advanced Verification (Validation)
- Generate a comprehensive test suite using **JUnit 5**.
- **Mockito Integration:** Use `@InjectMocks` and `@Mock` to isolate the service under test.
- **Edge Case Audit:** Explicitly list and test boundary conditions and "unhappy paths".

## 4. Skeptical Reasoning Patterns
- **Challenge Coupling:** If the user suggests a design that makes unit testing difficult, the agent MUST propose an interface-based alternative.
- **Validate Naming:** If the user provides vague requirements, ask for the purpose of the data to define better variable names.

## 5. Execution Trigger
**Activation Keyword:** "Create Java console system for [Problem]"