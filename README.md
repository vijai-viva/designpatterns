
## Design Patterns

### Creational Pattern

#### 1. Singleton Pattern
The Singleton pattern ensures that a class has only one instance and provides a global access point to that instance.

##### Where to use it:
* Database connections
* Logging systems
* Configuration managers
* Thread pools

##### Key Points:
* Private constructor (so no external object creation)
* Static method to get the instance
* Lazy or Eager initialization
------------------------
#### 2. Factory MEthod Pattern
The Factory Method Design Pattern is one of the most commonly used creational design patterns in object-oriented programming. It provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

##### When to Use 
* When the exact type of object to be created isn’t known until runtime.
* When you want to delegate the responsibility of instantiation to subclasses.
* When the creation logic is complex or involves multiple steps.

##### Concept
* You define an interface or abstract class for creating an object.
* Subclasses override this method to specify the type of object that will be created.

##### Summary
- [Cruise.java](src/com/viva/dev/patterns/creational/factory/Cruise.java) is the product interface.
- [LuxuryCruise.java](src/com/viva/dev/patterns/creational/factory/LuxuryCruise.java) and [BudgetCruise.java](src/com/viva/dev/patterns/creational/factory/BudgetCruise.java) are the concrete products.
- [CruiseFactory.java](src/com/viva/dev/patterns/creational/factory/CruiseFactory.java) is the creator, which uses createCruise() as the factory method.
- [LuxuryFactory.java](src/com/viva/dev/patterns/creational/factory/LuxuryFactory.java) and [BudgetFactory.java](src/com/viva/dev/patterns/creational/factory/BudgetFactory.java) are concrete creators.
- The client : [FactoryMethodCruiseApp](src/com/viva/dev/patterns/demo/FactoryMethodCruiseApp.java) works with the factory abstraction.
------------------------
#### 3. Abstract Factory Pattern
The Abstract Factory Pattern is a creational design pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes.
It's like a factory of factories — each factory creates objects related by a theme.

##### When to Use
* When your system needs to create multiple families of products.
* When the system needs to be independent of how products are created, composed, and represented.
* When products in a family are designed to work together.

------------------------
#### 4. Builder Pattern
The Builder Pattern is a creational design pattern used to construct complex objects step-by-step. It separates the construction of a complex object from its representation so the same construction process can create different representations.

##### When to Use
* When an object needs to be created with many optional parameters.
* When the object creation process should be independent from the parts that make up the object and how they’re assembled.

------------------------
#### 5. Prototype Pattern
The Prototype Pattern is a creational design pattern that is used to create duplicate objects while keeping performance in mind. Instead of creating a new object from scratch, you clone an existing one.

##### When to Use
* When object creation is expensive
* When you need many similar objects.
* When you want to avoid subclassing to create new instances.
* When you want to decouple the code that creates the object from the object itself.


