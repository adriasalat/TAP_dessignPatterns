# Java Design Patterns Collection

A curated set of classic **design pattern implementations in Java**, organized by folder and designed to be **small, readable, and framework-agnostic**.

---

## 📁 Contents

### Creational
- **abstractFactory**
- **singleton**

### Structural
- **adapter**
- **composite**
- **decorator**
- **proxy**

### Behavioral
- **iterator**
- **observer**
- **state**
- **strategy**
- **template**
- **visitor**

Each folder contains minimal classes that highlight:
- Core roles (interfaces / abstract types, concrete implementations)
- A simple runnable example

---

## 🧭 Pattern Quick Reference

### **Creational Patterns**
- **abstractFactory** — Create families of related objects without coupling to concrete classes; switch entire product families by changing the factory.  
- **singleton** — Guarantee exactly one instance with controlled global access; prefer lazy, thread-safe initialization.

### **Structural Patterns**
- **adapter** — Make incompatible interfaces work together by translating one interface into another expected by clients.  
- **composite** — Model tree structures so clients can treat single objects and compositions uniformly.  
- **decorator** — Add responsibilities to objects dynamically through composition rather than inheritance.  
- **proxy** — Provide a stand-in to control access, add caching, lazy loading, or remote indirection.

### **Behavioral Patterns**
- **iterator** — Traverse collections without exposing their internal representation with a consistent `next()` / `hasNext()` API.  
- **observer** — Establish a one-to-many dependency so observers are notified automatically when the subject’s state changes.  
- **state** — Let an object alter its behavior by delegating to state objects that represent internal modes.  
- **strategy** — Encapsulate interchangeable algorithms behind a common interface and swap them at runtime.  
- **template** — Define the algorithm skeleton in a base class while deferring variable steps to subclasses.  
- **visitor** — Separate operations from object structures to add new behaviors without modifying element classes.
