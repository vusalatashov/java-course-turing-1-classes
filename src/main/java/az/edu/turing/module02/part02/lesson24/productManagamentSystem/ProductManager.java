package az.edu.turing.module02.part02.lesson24.productManagamentSystem;

import java.util.List;
import java.util.function.Consumer;

public class ProductManager {
    private final List<Product> products;

    public ProductManager(List<Product> products) {
        this.products = products;
    }

    public void sortProductsByPriceAscending() {
        products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        products.forEach(System.out::println);
    }

    public void sortProductsByPriceDescending() {
        products.sort((p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()));
        products.forEach(product -> System.out.println(product));
    }

    public void printInStockProducts(Consumer<Product> consumer) {
        for (Product product : products) {
            if (product.isInStock()) {
                consumer.accept(product);
            }
        }
    }

    public void filterAndPrintDeskProducts() {
        for (Product product : products) {
            if (product.getName().toLowerCase().contains("desk")) {
                System.out.println(product);
            }
        }
    }

    public void getAndPrintCheapestProduct() {
        if (products.isEmpty()) {
            System.out.println("Məhsul siyahısı boşdur.");
            return;
        }

        Product cheapest = products.get(0);
        for (Product product : products) {
            if (product.getPrice() < cheapest.getPrice()) {
                cheapest = product;
            }
        }
        System.out.println(cheapest);
    }

    public void sortProductsByRatingDescending() {
        products.sort((p1, p2) -> Double.compare(p2.getRating(), p1.getRating()));
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
