# Builder Design Pattern
## Definition
The builder pattern provides a build object which is used to construct a complex object called the product. It 
encapsulates the logic of constructing the different pieces of the product.


## Applicability
- Use the Builder pattern to get rid of a “telescopic constructor”.

```
class Task {
    Task(int id) { ... }
    Task(int id, boolean done) { ... }
    Task(int id, boolean done, String description) { ... }
    Task(int id, boolean done, String description, String summary) { ... }
    // ...
```

- Use the Builder pattern when you want your code to be able to create different representations of some product 
(for example, stone and wooden houses).
