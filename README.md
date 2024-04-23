
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Dhruv Prajapati       |
| Date         | 04/22/2024                 |
| Course       |  Spring      |
| Assignment 6 |                            |

# Assignment Details

Examined the previous project assignment 1 and identified code improvement opportunities and refactored the code.

# GitHub Repository Link:
https://github.com/Dhruv-praju/CS665-Assignment-6

# Implementation Description 

The refactored UML diagram incorporates several improvements over the previous design, addressing the identified areas of concern and adhering to object-oriented design principles. Here's an explanation of how the design has improved:

1. **Introduction of Abstract Classes and Interfaces**:
   - The introduction of the `Beverage` and `CondimentDecorator` abstract classes promotes better code organization, extensibility, and adherence to the Open/Closed Principle (OCP).
   - By defining common properties and methods in the abstract classes, you can easily extend the functionality by creating new concrete subclasses without modifying the existing code.
   - The use of abstract classes also facilitates code reuse and helps in avoiding code duplication.

2. **Separation of Concerns**:
   - The design now separates the concerns of creating beverages, adding condiments, and calculating prices into distinct components.
   - The `VendingMachine` class is now responsible for creating beverages through the respective factories (`CoffeeFactory` and `TeaFactory`).
   - The `CondimentDecorator` abstract class and its concrete subclasses (`Milk` and `Sugar`) handle the addition and management of condiments.
   - The price calculation logic is encapsulated within the `Beverage` and `CondimentDecorator` classes, promoting better encapsulation and making it easier to modify or extend the pricing rules in the future.

3. **Use of Design Patterns**:
   - The refactored design incorporates the use of the Abstract Factory Pattern (`CoffeeFactory` and `TeaFactory`) for creating different types of beverages.
   - The Decorator Pattern is implemented through the `CondimentDecorator` abstract class and its concrete subclasses (`Milk` and `Sugar`), allowing dynamic addition and removal of condiments to beverages.
   - The encapsulation of price calculation within the `Beverage` and `CondimentDecorator` classes follows the principles of the Strategy Pattern, making it easier to modify or replace the pricing strategy in the future.

4. **Improved Extensibility and Maintainability**:
   - The introduction of abstract classes and interfaces, along with the use of design patterns, makes the code more extensible and maintainable.
   - Adding new types of beverages or condiments can be done by creating new concrete subclasses without modifying the existing code, adhering to the Open/Closed Principle.
   - Modifying or replacing the pricing logic can be achieved by updating the respective classes (`Beverage` and `CondimentDecorator`) without affecting other parts of the code.
   - The separation of concerns and encapsulation of responsibilities in different classes improve code readability, testability, and overall maintainability.

5. **Code Reuse and Reduced Duplication**:
   - The use of abstract classes and interfaces promotes code reuse by allowing concrete subclasses to inherit common properties and behaviors.
   - The `calculatePrice()` method in the `CondimentDecorator` class avoids duplication of price calculation logic for different condiments.
   - The factories (`CoffeeFactory` and `TeaFactory`) encapsulate the creation of specific types of beverages, reducing duplication and promoting code reuse.

Overall, the refactored design adheres to the principles of object-oriented design, such as the Open/Closed Principle, Single Responsibility Principle, and encapsulation. It promotes code reuse, extensibility, maintainability, and testability, making it easier to add new features, modify existing functionality, and adapt to changing requirements in the future.



# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/) on your system. 

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains information about the project, such as its dependencies, the build configuration, and the plugins used for building and packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports, and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile
Type on the command line: 

```bash
mvn clean compile
```



## JUnit Tests
JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```


## Spotbugs 

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


## Checkstyle 

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on any issues or violations of the coding standards defined in its configuration. This includes issues like code style, code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices, making it easier for other developers to read and maintain. It can also help to identify potential issues before the code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser. 

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`




