# SOFE-3650U-100820450
Ass Group 17 
# SOFE-3650U

# Assignment 1: Design Patterns

## Group #17

### David Hanna 100828635
### Hasan Khan 100820450
### Abdullah Ahmed 100821709


## Project Overview

- [Repository Structure](#repository-structure)
- [UML Diagram](#uml-diagram)
- [Test Driver](#test-driver)

---

## Repository Structure

```
- AAAIGNMENT 1
	- screenDumps
		- data_ss.jpg
		- Test_Output.jpg
		- UML_Diagram.png
	- src
		- data
			- data.txt
		-Apples.java
        -Bananas.java
        -ConcreteGroceryFactory.java
        -GroceryFactory.java
        -GroceryProduct.java
        -GroceryStoreTest.java
        -readMe.md


	- UML
		- UML.drawio
	- REAME.md
	- test.java
```

## UML Diagram

![](./Assignment_GRP_17/image/uml.jpg)

## Test Driver

> data.txt

![](./Assignment_GRP_17/image/test.jpg)

---

> GroceryStoreTest.java

```
public class GroceryStoreTest {
    public static void main(String[] args) {
        GroceryFactory factory = new ConcreteGroceryFactory();

        GroceryProduct bananas = factory.createProduct("Bananas");
        GroceryProduct apples = factory.createProduct("Apples");
        bananas.setPrice(0.75);
        apples.setPrice(1.79);
        System.out.println("Product: " + bananas.getName() + ", Price: $" + bananas.getPrice());
        System.out.println("Product: " + apples.getName() + ", Price: $" + apples.getPrice());
    }
}

```

- We test our Abstract Factory Design Pattern using a `data.txt` file that contains product names and prices of grocery items.
- We read each line, split it into `product` and `price`, and store these in their respective variables.
- Using the product name, we call the `getFactory` method from the `factoryProducer` abstract class to get a `GroceryProductFactory` instance.
- If the `factory` instance exists for the product, we set its `price` and print its results.
- If a `FileNotFoundException` occurs during execution of the `try` block, we `catch` it and print an error message along with the exception's stack trace.

> test.java | Output
---
![](./Assignment_GRP_17/image/test.jpg)
