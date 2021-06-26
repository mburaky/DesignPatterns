# Adapter Design Pattern
## Definition
An Adapter pattern acts as a connector between two incompatible interfaces that otherwise cannot be connected directly 
and wraps an existing class with a new interface so that it becomes compatible with the client’s interface.

The main motive behind using this pattern is to convert an existing interface into another interface that the client 
expects. It's usually implemented once the application is designed.

## Applicability
- Use the Adapter class when you want to use some existing class, but its interface isn’t compatible with the rest of 
your code.

- The Adapter pattern lets you create a middle-layer class that serves as a translator between your code and a 
legacy class, a 3rd-party class or any other class with a weird interface.

- Use the pattern when you want to reuse several existing subclasses that lack some common functionality that can’t be 
added to the superclass.
