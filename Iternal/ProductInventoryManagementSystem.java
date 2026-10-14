import java.util.ArrayList;
import java.util.Scanner;

class Product {
    int productId;
    String name;
    double price;
    int quantity;

    Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("----------------------");
    }
}

public class ProductInventoryManagementSystem {

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Product Inventory Management ---");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Search Product by Name");
            System.out.println("4. Display Low-Quantity Products");
            System.out.println("5. Display All Products");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    products.add(new Product(id, name, price, quantity));
                    System.out.println("Product added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Product ID to remove: ");
                    int removeId = sc.nextInt();
                    boolean removed = false;

                    for (int i = 0; i < products.size(); i++) {
                        if (products.get(i).productId == removeId) {
                            products.remove(i);
                            removed = true;
                            break;
                        }
                    }

                    if (removed)
                        System.out.println("Product removed successfully!");
                    else
                        System.out.println("Product not found.");
                    break;

                case 3:
                    System.out.print("Enter Product Name to search: ");
                    String searchName = sc.nextLine();
                    boolean found = false;

                    for (Product p : products) {
                        if (p.name.equalsIgnoreCase(searchName)) {
                            p.display();
                            found = true;
                        }
                    }

                    if (!found)
                        System.out.println("Product not found.");
                    break;

                case 4:
                    System.out.print("Enter quantity limit: ");
                    int limit = sc.nextInt();
                    boolean lowStock = false;

                    for (Product p : products) {
                        if (p.quantity < limit) {
                            p.display();
                            lowStock = true;
                        }
                    }

                    if (!lowStock)
                        System.out.println("No low-quantity products found.");
                    break;

                case 5:
                    if (products.isEmpty()) {
                        System.out.println("Inventory is empty.");
                    } else {
                        for (Product p : products) {
                            p.display();
                        }
                    }
                    break;

                case 6:
                    System.out.println("Exiting Inventory System.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}