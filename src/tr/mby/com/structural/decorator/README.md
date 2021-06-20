# Decorator Design Pattern
## Definition
We use inheritance or composition to extend the behavior of an object but this is done at `compile time` and its 
applicable to all the instances of the class. 

We can’t add any new functionality of remove any existing behavior `at runtime` – this is when Decorator pattern comes 
into picture.


## Applicability
- Use the Decorator pattern when you need to be able to assign extra behaviors to objects at runtime without breaking 
the code that uses these objects.

- The Decorator lets you structure your business logic into layers, create a decorator for each layer and compose 
objects with various combinations of this logic at runtime. The client code can treat all these objects in the same way, 
since they all follow a common interface.

- Use the pattern when it’s awkward or not possible to extend an object’s behavior using inheritance.

- Many programming languages have the final keyword that can be used to prevent further extension of a class. For a 
final class, the only way to reuse the existing behavior would be to wrap the class with your own wrapper, using the 
Decorator pattern.

