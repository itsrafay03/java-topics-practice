# Java Core Concepts: A Practice Repository

![Language: Java](https://img.shields.io/github/languages/top/itsrafay03/java-topics-practice?style=for-the-badge&logo=java&color=orange)
![Repo Size](https://img.shields.io/github/repo-size/itsrafay03/java-topics-practice?style=for-the-badge&logo=github)
![Last Commit](https://img.shields.io/github/last-commit/itsrafay03/java-topics-practice?style=for-the-badge&color=blue)

A comprehensive, hands-on collection of code examples designed to build, practice, and solidify a strong foundation in core Java programming concepts. This repository is ideal for students, self-learners, and developers looking to refresh their fundamental Java skills.

## 📋 Table of Contents
* [About This Project](#-about-this-project)
* [Key Features](#-key-features)
* [Technology Stack](#-technology-stack)
* [Repository Structure & Topics](#-repository-structure--topics)
* [Getting Started](#-getting-started)
* [Contributing](#-contributing)
* [License](#-license)

## 🎯 About This Project
The primary goal of this repository is to serve as a practical "workbook" for Java programming. By isolating each core concept into its own dedicated package, it provides a structured and organized way to learn and review.

The main objectives are:
*   **Reinforce Fundamentals:** Solidify understanding through focused, practical code.
*   **Serve as a Quick Reference:** Easily find and review specific Java concepts without unnecessary complexity.
*   **Demonstrate Clean Code Practices:** Each example aims for clarity and follows standard Java conventions.
*   **Track Learning Progress:** Acts as a living document of skills acquired in core Java.

## ✨ Key Features
*   **Modular Structure:** Each topic is encapsulated in its own package for maximum clarity.
*   **Focused Examples:** The code is simple and directly demonstrates the concept at hand, avoiding boilerplate.
*   **Comprehensive Coverage:** Spans from the most basic data types to the foundational pillars of Object-Oriented Programming (OOP).
*   **Ready to Run:** Each example is self-contained and can be compiled and run with a standard JDK.

## 🛠️ Technology Stack
*   **Language:** **Java**
*   **Build/Run:** **JDK (Java Development Kit)**

## 📁 Repository Structure & Topics
The repository is organized logically, with all source code residing in the `src` directory. Each subfolder corresponds to a specific Java concept.


### Detailed Topic Breakdown

| Topic                    | Folder Name                                                       | Description                                                                    |
| ------------------------ | ----------------------------------------------------------------- | ------------------------------------------------------------------------------ |
| **Data Types & Variables** | [`dataTypesAndVariables`](./src/dataTypesAndVariables)              | Practice with Java's primitive and reference data types and variable declaration. |
| **Operators**            | [`operators`](./src/operators)                                    | Using arithmetic, relational, logical, and other Java operators.               |
| **Statements**           | [`statements`](./src/statements)                                  | Using conditional statements like `if-else`, `else-if`, and `switch`.          |
| **Loops**                | [`loops`](./src/loops)                                            | Practice with `for`, `while`, and `do-while` loops for controlled iteration.     |
| **Arrays**               | [`arrays`](./src/arrays)                                          | Practice with single and multi-dimensional arrays, iteration, and manipulation.    |
| **Strings**              | [`strings`](./src/strings)                                        | Working with the `String` class and its various utility methods.                 |
| **Methods**              | [`methods`](./src/methods)                                        | Defining and invoking methods, understanding parameters, and return types.         |
| **Input & Output (I/O)**  | [`inputAndOutput`](./src/inputAndOutput)                          | Reading user input from the console (`Scanner`) and printing output.             |
| **Classes & Objects**    | [`classesAndObjects`](./src/classesAndObjects)                      | Fundamentals of OOP, including class definitions and object instantiation.       |
| **Constructors**         | [`constructors`](./src/constructors)                              | Understanding default, parameterized, and overloaded constructors.               |
| **Inheritance**          | [`inheritance`](./src/inheritance)                                | Examples of creating subclass/superclass relationships (`extends`).              |
| **Polymorphism**         | [`polymorphism`](./src/polymorphism)                              | Demonstrating method overriding and dynamic method dispatch.                     |
| **Encapsulation**        | [`encapsulation`](./src/encapsulation)                              | Implementing data hiding using `private` fields and public getters/setters.      |
| **Exception Handling**   | [`exceptionHandling`](./src/exceptionHandling)                      | Using `try-catch-finally` blocks to manage runtime errors gracefully.          |
| **Collections Framework**| [`collections`](./src/collections)                                | Examples using `ArrayList`, `HashMap`, and other common collection types.          |


## 🚀 Getting Started

### Prerequisites
*   **Java Development Kit (JDK)**: Ensure you have a JDK (version 8 or newer) installed. You can download it from [Oracle](https://www.oracle.com/java/technologies/downloads/) or use an open-source distribution like [OpenJDK](https://openjdk.java.net/).

### Installation & Execution

1.  **Clone the repository to your local machine:**
    ```bash
    git clone https://github.com/itsrafay03/java-topics-practice.git
    ```

2.  **Navigate to the source directory using your terminal:**
    ```bash
    cd java-topics-practice/src
    ```

3.  **Compile a Java file.** The `javac` command compiles your `.java` source file into `.class` bytecode.
    *Example with a file from the `loops` package:*
    ```bash
    # This command must be run from the 'src' directory
    javac loops/ForLoopExample.java
    ```

4.  **Run the compiled program.** The `java` command executes the bytecode. You must use the fully qualified class name (e.g., `packageName.ClassName`).
    *Example:*
    ```bash
    # This command must also be run from the 'src' directory
    java loops.ForLoopExample
    ```

## 🤝 Contributing

This is a personal portfolio and learning project, but suggestions and contributions are welcome! If you have ideas for improvement or find a bug, please feel free to:

1.  Fork the Project
2.  Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3.  Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4.  Push to the Branch (`git push origin feature/AmazingFeature`)
5.  Open a Pull Request

You can also simply open an issue with the tag "enhancement" or "bug".

## 📜 License
This project is open-source and available under the **MIT License**. See the `LICENSE` file for more information.
*(Note: You'll need to add a file named `LICENSE` with the MIT License text for this to be fully effective).*

---
Happy Coding!
