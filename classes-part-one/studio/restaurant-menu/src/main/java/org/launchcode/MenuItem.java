package org.launchcode;


// Class declaration...
public class MenuItem {

    // Field Items...
    private String name;
    private String description;
    private double price;
    private String category;
    private final String dateAdded;

    // Constructor to initialize new objects
    public MenuItem(String name, String description, Double price, String category, String dateAdded) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = dateAdded;
    }

    // Method - Create the Getters and Setters....

    // Get Name
    public String getName() {
        return name;
    }

    // Set Name
    void setName(String name) {
        this.name = name;
    }

    // Get Description
    public String getDescription() {
        return description;
    }

    // Set Description
    void setDescription(String description) {
        this.description = description;
    }

    // Get Price
    public Double getPrice() {
        return price;
    }

    // Set Price
    void setPrice(double price) {
        this.price = price;
    }

    // Get Category
    public String getCategory() {
        return category;
    }

    // Set Category
    void setCategory(String category) {
        this.category = category;
    }

    // Get Date Added
    public String getDateAdded() {
        return dateAdded;
    }

    // Set Date Added
 void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }


    // Display the method...
    public String displayItem() {
        return name + " - " + description + ": $" + price + " Date Added: " + dateAdded;
    }

}
