package ECommerce;

public class SearchTest {
 public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Electronics"),
                new Product(103, "Keyboard", "Electronics"),
                new Product(104, "Phone", "Mobile"),
                new Product(105, "Tablet", "Mobile")

        };

        System.out.println("Linear Search");

        Product result1 = SearchAlgorithms.linearSearch(products, 104);

        if (result1 != null) {
            result1.display();
        } else {
            System.out.println("Product not found.");
        }

        System.out.println();

        System.out.println("Binary Search");

        Product result2 = SearchAlgorithms.binarySearch(products, 104);

        if (result2 != null) {
            result2.display();
        } else {
            System.out.println("Product not found.");
        }

    }

}
 

