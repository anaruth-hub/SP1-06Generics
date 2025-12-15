\# SP01-06Generics



Description: Java project (Maven) with Generics exercises to practice non-generic vs generic implementations, generic methods, partial generics (fixed + generic parameters), and generic varargs. Includes execution from IntelliJ IDEA and via terminal (PowerShell).



\## 📌 Exercise statement



Project organized by exercise levels:



\### Level 1



\*\*Ex01: No generics (baseline)\*\*  

Create `NoGenericMethods` that stores 3 element (same type in usage), with constructor and getters:

\- `getitem1()`, `getitem2()`, `getitem3()`

Test that you can pass arguments in any order.



\*\*Ex02: Generic method with mixed parameters\*\*  

Create `Person (name, lastname, age)` and a class `GenericMethods` with a generic method `printElements()` that accepts 3 generic arguments and prints them.  

Test calling it with different types and orders (e.g., `Person`, `String`, numeric).



\### Level 2



\*\*Ex01: Partial generic (one fixed parameter)\*\*  

Adapt the previous exercise so that one argument is NOT generic (fixed type `String`) and the other two remain generic.



\*\*Ex02: Generic varargs\*\*  

Adapt the previous exercise so the method accepts a variable number of generic arguments (varargs). Method name: `printAll()`.



\## ✨ Features



\- Comparison between non-generic approach (using `Object`) vs generic methods.

\- Generic method with multiple type parameters.

\- Partial generic method (fixed `String` + generic parameters).

\- Generic varargs method with `@SafeVarargs`.

\- Simple console output validation (no external dependencies).



\## 🛠 Technologies



\- Java (JDK 17 recommended for IntelliJ + Maven)

\- Maven (`pom.xml`)

\- IntelliJ IDEA

\- Git + GitHub (push from terminal / GitHub CLI)



\## 🚀 Installation and Execution



\### 1) Clone the repository



```bash

git clone <URL\_DEL\_REPO>

cd SP01-06Generics



