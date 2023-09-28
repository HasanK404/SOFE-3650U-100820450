# SOFE-3650U-100820450
Ass Group 17 

![](./Assignment_GRP_17/image/test.jpg)

![](./Assignment_GRP_17/image/output.jpg)


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

> test.java

```
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test{

    public static void main(String[] args) {
              try {
            // Read and Scan file
            File dataFile = new File("./src/data/data.txt");
            Scanner read = new Scanner(dataFile);

            while (read.hasNextLine()) {
                String data = read.nextLine();

                // Split Product name and price
                String[] parts = data.split(" ");

                String product = parts[0];
                double price = Double.parseDouble(parts[1]);

                // Get the factory for the product
                GroceryProductFactory factory = factoryProducer.getFactory(product);
                if (factory != null) {
                    // Set the price and print the factory
                    factory.setPrice(price);
                    System.out.println(factory);
                }
            }
        read.close();
        } catch (FileNotFoundException e) {
            System.out.println("Something went wrong -_-");
            e.printStackTrace();
        }

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
