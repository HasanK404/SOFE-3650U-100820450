import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ConcreteGroceryFactory implements GroceryFactory {
    private Map<String, Double> productPrices;

    public ConcreteGroceryFactory() {
        productPrices = new HashMap<>();
        loadProductPrices();
    }

    private void loadProductPrices() {
        try (BufferedReader reader = new BufferedReader(new FileReader("read.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String productName = parts[0].trim();
                    double price = Double.parseDouble(parts[1].trim());
                    productPrices.put(productName, price);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public GroceryProduct createProduct(String name) {
        GroceryProduct product;
        if (name.equalsIgnoreCase("bananas")) {
            product = new Bananas(name);
        } else if (name.equalsIgnoreCase("apples")) {
            product = new Apples(name);
        } else {
            throw new IllegalArgumentException("Unknown product: " + name);
        }

        double price = productPrices.getOrDefault(name.toLowerCase(), 0.0);
        product.setPrice(price);

        return product;
    }
}
