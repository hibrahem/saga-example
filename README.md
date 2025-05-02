# Saga Pattern Implementation Example

This repository contains a practical implementation of the Saga pattern, demonstrating both orchestration and choreography approaches for managing distributed transactions in microservices architectures.

## Project Structure

The project is organized into three main components:

### 1. Orchestrator Pattern Implementation
Located in `src/orchestrator/`, this implementation demonstrates the centralized orchestration approach where a central coordinator manages the saga execution. Key components include:
- `OrderSaga.java`: The main saga implementation
- `SagaState.java`: Represents the state of a saga
- `SagaStep.java`: Defines individual steps in the saga
- `SagaStore.java`: Handles saga state persistence

### 2. Choreography Pattern Implementation
Located in `src/choreograpphy/`, this implementation shows the decentralized choreography approach where services communicate through events. Key components include:
- `Main.java`: Entry point for the choreography implementation
- `services/`: Contains individual service implementations

### 3. Common Components
Located in `src/common/`, contains shared utilities and components used by both implementations.

## Getting Started

1. Clone the repository
2. Open the project in your preferred Java IDE
3. Run the examples from either the orchestrator or choreography implementations

## About the Saga Pattern

The Saga pattern is a way to manage distributed transactions in microservices architectures. It breaks down a large transaction into a series of smaller, local transactions that can be executed independently. If any step fails, compensating transactions are executed to maintain data consistency.

### Orchestration vs Choreography

- **Orchestration**: Uses a central coordinator to manage the saga execution
- **Choreography**: Services communicate through events without a central coordinator

## This project is part of the Software Architecture course by Tech Mentors 