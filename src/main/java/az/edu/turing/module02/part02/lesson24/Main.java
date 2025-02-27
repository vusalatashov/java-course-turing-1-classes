package az.edu.turing.module02.part02.lesson24;

import java.util.*;
import java.util.function.*;

class Product implements Comparable<Product> {
    private final String name;
    private final String category;
    private final double price;
    private final double rating;
    private final boolean inStock;

    // Constructor
    public Product(String name, String category, double price, double rating, boolean inStock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.rating = rating;
        this.inStock = inStock;
    }

    // Getter-lər
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public boolean isInStock() {
        return inStock;
    }

    @Override
    public int compareTo(Product other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return String.format("Product{name='%s', category='%s', price=%.2f, rating=%.1f, inStock=%b}",
                name, category, price, rating, inStock);
    }
}

class ProductManager {
    private final List<Product> products;

    public ProductManager(List<Product> products) {
        this.products = products;
    }

    public void sortProducts(Comparator<Product> comparator) {
        products.sort(comparator);
    }

    public List<Product> filterProducts(Predicate<Product> predicate) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (predicate.test(product)) {
                result.add(product);
            }
        }
        return result;
    }

    public void printInStockProducts(Consumer<Product> consumer) {
        for (Product product : products) {
            if (product.isInStock()) {
                consumer.accept(product);
            }
        }
    }

    public Product getCheapestProduct(Supplier<Product> supplier) {
        return supplier.get();
    }
}
public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics", 1200.00, 4.5, true),
                new Product("Smartphone", "Electronics", 800.00, 4.7, true),
                new Product("T-Shirt", "Clothing", 20.00, 4.2, true),
                new Product("Blender", "Home Appliances", 50.00, 3.8, false),
                new Product("Desk", "Furniture", 150.00, 4.0, true),
                new Product("Chair", "Furniture", 75.00, 3.9, true)
        );

        ProductManager manager = new ProductManager(products);

        System.out.println("Məhsullar qiymətə görə artan:");
        Product[] productArray = products.toArray(new Product[0]);
        Arrays.sort(productArray, Comparator.comparingDouble(Product::getPrice));
        for (Product product : productArray) {
            System.out.println(product);
        }

        System.out.println("\nMəhsullar qiymətə görə azalan:");
        Arrays.sort(productArray, Comparator.comparingDouble(Product::getPrice).reversed());
        for (Product product : productArray) {
            System.out.println(product);
        }

        System.out.println("\nStokda olan məhsullar:");
        List<Product> inStockProducts = new ArrayList<>();
        manager.printInStockProducts(inStockProducts::add);
        for (Product product : inStockProducts) {
            System.out.println(product);
        }

        System.out.println("\nAdında 'Desk' olan məhsullar:");
        List<Product> filteredProducts = manager.filterProducts(product -> product.getName().contains("Desk"));
        for (Product product : filteredProducts) {
            System.out.println(product);
        }

        System.out.println("\nƏn ucuz məhsul:");
        Product cheapest = manager.getCheapestProduct(() -> {
            Product min = products.get(0);
            for (Product product : products) {
                if (product.getPrice() < min.getPrice()) {
                    min = product;
                }
            }
            return min;
        });
        System.out.println(cheapest);

        System.out.println("\nMəhsullar reytinqə görə azalan:");
        manager.sortProducts((p1, p2) -> Double.compare(p2.getRating(), p1.getRating()));
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
