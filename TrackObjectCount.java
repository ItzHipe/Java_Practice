class Product {
    static int productCount = 0;
    String productName;

    Product(String name) {
        this.productName = name;
        productCount++;
    }
    static void displayCount() {
        System.out.println("Total number of products created: " + productCount);
    }

    void displayProduct() {
        System.out.println("Product Name: " + productName);
    }
}


public class TrackObjectCount {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop");
        Product p2 = new Product("Mobile");
        Product p3 = new Product("Tablet");

        p1.displayProduct();
        p2.displayProduct();
        p3.displayProduct();

        Product.displayCount();
    }
}
