# Java RMI (Remote Method Invocation)

A Java-based client–server application demonstrating Remote Method Invocation (RMI). It allows a client to call methods on a remote Java object running on the server. 

## Features

- Client–server communication using Java RMI
- Remote method invocation
- Remote interface implementation
- Server-side remote object
- Client connection to the RMI server

## Technologies Used

- Java
- Java RMI
- JDK
- Visual Studio Code

## Project Files

- `MyInterface.java` – Defines the remote interface.
- `MyRemote.java` – Implements the remote functionality.
- `Server.java` – Starts the RMI server.
- `Client.java` – Connects to the server and invokes remote methods.

## Prerequisites

- JDK installed
- Visual Studio Code or another Java IDE

## How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/anjuyadav21122006-crypto/Java-RMI.git
   ```

2. Open the project folder in Visual Studio Code.
3. Open a terminal in the project directory.
4. Compile the Java files:

   ```bash
   javac *.java
   ```

5. Start the server:

   ```bash
   java Server
   ```

6. Open a second terminal in the same directory.
7. Run the client:

   ```bash
   java Client
   ```

**Note:** Run the server before the client. If
