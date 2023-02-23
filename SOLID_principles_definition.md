# SOLID Principles
**S** = Single Responsibility Principle (SRP)
**O** = Open/Close Principle (OCP)
**L** = Liskov Substitution Principle (LSP)
**I** = Interface Segregation Principle (ISP)
**D** = Dependency Inversion Principle (DIP)

## SRP
A class must have ***one responsibility only***.

**Key**: less is more. The fewer tasks that a class is responsible for (via methods), the better. 

## OCP
A software artifact should be ***open to extension*** but ***closed for modification***.

**Key**: abstraction (via interface or abstract class). Let detailed implementation be defined in smaller units of class.

Good example of OCP is ***Strategy Pattern***.

## LSP
You should be able to substitute a ***parent*** type with a ***subtype***.

## ISP
A client should not depend on a method that it does not use.

## DIP
1. A high-level concrete class should not depend on a low-level concrete class. Instead, both must depend on abstractions.
2. Abstractions should not depend upon details. Instead, the details should depend upon abstractions.

**Key**: (again) use interface for abstraction to allow loose coupling whose details are defined in smaller units of class.