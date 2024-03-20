import java.util.ArrayList;

abstract class Item {
    private String productName;
    private double price;

    public Item(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public abstract void displayDetails();

   
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


class Product extends Item {
    private int productId;
    private int quantityInStock;

    public Product(String productName, double price, int productId, int quantityInStock) {
        super(productName, price);
        this.productId = productId;
        this.quantityInStock = quantityInStock;
    }

    
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

  
    public void updateStock(int quantity) {
        this.quantityInStock += quantity;
    }

    public double calculateInventoryValue() {
        return getPrice() * getQuantityInStock();
    }

    
   
    public void displayDetails() {
        System.out.println("Product ID: " + getProductId());
        System.out.println("Product Name: " + getProductName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Quantity in Stock: " + getQuantityInStock());
    }
}


class Inventory {
    private final ArrayList<Product> productList = new ArrayList<>();

   
    public void addProduct(Product product) {
        productList.add(product);
    }

   
    public void displayInventory() {
        for (Product product : productList) {
            product.displayDetails();
            System.out.println("Total Inventory Value: $" + product.calculateInventoryValue());
            System.out.println();
        }
    }
}
    
public class TechMartInventorySystem {
    public static void main(String[] args) {
        
        Product electronicProduct = new Product("television", 1200.0, 101, 50);
        Product clothingProduct = new Product("skirt", 50.0, 205, 200);

       
        Inventory techMartInventory = new Inventory();
        techMartInventory.addProduct(electronicProduct);
        techMartInventory.addProduct(clothingProduct);

       
        System.out.println("Current Inventory Details:");
        techMartInventory.displayInventory();
    }
}