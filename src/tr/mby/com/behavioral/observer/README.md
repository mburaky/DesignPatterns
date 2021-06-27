# Observer Design Pattern
## Definition
Observer is a behavioral design pattern that lets you define a subscription mechanism to notify multiple objects about 
any events that happen to the object they’re observing.

The Observer Design Pattern maintains one-to-many dependency between Subject (Observable) and its dependents (Observer) 
in such a way that whenever state of Subject changes, its dependents get notified.


## Applicability
-  Use the Observer pattern when changes to the state of one object may require changing other objects, and the actual 
set of objects is unknown beforehand or changes dynamically.

- Use the pattern when some objects in your app must observe others, but only for a limited time or in specific cases.


## References
- https://refactoring.guru/design-patterns/behavioral-patterns
- https://dzone.com/articles/observer-design-pattern-in-java