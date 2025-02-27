package az.edu.turing.module02.part02.lesson24.productManagamentSystem;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = getProductManager();

        System.out.println("Məhsulları qiymətə görə artan sıraya düzün:");
        manager.sortProductsByPriceAscending();

        System.out.println("\nMəhsulları qiymətə görə azalan sıraya düzün:");
        manager.sortProductsByPriceDescending();

        System.out.println("\nStokda olan məhsulları çap edin:");
        manager.printInStockProducts(System.out::println);

        System.out.println("\nAdında 'Desk' olan məhsulları filtrləyin və çap edin:");
        manager.filterAndPrintDeskProducts();

        System.out.println("\nƏn ucuz məhsulu tapın və çap edin:");
        manager.getAndPrintCheapestProduct();

        System.out.println("\nMəhsulları reytinqə görə azalan sıraya düzün:");
        manager.sortProductsByRatingDescending();
    }

    private static ProductManager getProductManager() {
        List<Product> productList = Arrays.asList(
                new Product("Laptop", "Electronics", 1200, 4.5, true),
                new Product("Smartphone", "Electronics", 800, 4.7, true),
                new Product("T-Shirt", "Clothing", 20, 4.2, true),
                new Product("Blender", "Home Appliances", 50, 3.8, false),
                new Product("Desk", "Furniture", 150, 4.0, true),
                new Product("Chair", "Furniture", 75, 3.9, true)
        );

        ProductManager manager = new ProductManager(productList);
        return manager;
    }
}
