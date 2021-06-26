# Bridge Design Pattern
## Definition
Bridge is a structural design pattern that lets you split a large class or a set of closely related classes into two 
separate hierarchies—abstraction and implementation—which can be developed independently of each other.


## Applicability
- Use the Bridge pattern when you want to divide and organize a monolithic class that has several variants of some 
functionality (for example, if the class can work with various database servers).

-  The Bridge suggests that you extract a separate class hierarchy for each of the dimensions. The original class 
delegates the related work to the objects belonging to those hierarchies instead of doing everything on its own.

