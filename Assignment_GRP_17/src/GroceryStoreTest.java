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
