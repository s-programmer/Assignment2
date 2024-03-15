package techmartinventory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
//import org.apache.poi.ss.usermodel.*;

// Abstract class for Item
abstract class Item {
    protected String productName;
    protected double price;

    public Item(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public abstract void displayDetails();
}

// Product class
class Product extends Item {
    private int id;
    private int quantityInStock;

    public Product(String productName, int id, double price, int quantityInStock) {
        super(productName, price);
        this.id = id;
        this.quantityInStock = quantityInStock;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    // Method to update stock quantity
    public void updateStockQuantity(int quantity) {
        this.quantityInStock += quantity;
    }

    // Method to calculate total inventory value
    public double calculateInventoryValue() {
        return price * quantityInStock;
    }

    