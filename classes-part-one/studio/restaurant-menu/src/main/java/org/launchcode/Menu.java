package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    // Field Items.... ArrayList<> - Use ArrayList to represent each property or data the class will have...
    private ArrayList<MenuItem> items;
    private Date lastUpdated;

    // Constructor - used to instantiate newly created objects with the same properties, etc...
    public Menu() {
        this.items = new ArrayList<>(); // Initialized as an empty ArrayList. Allows me to add MenuItems to it...
        this.lastUpdated = new Date();
    }

    // Method - Use a getter to retrieve Menu Items
    public void addItem(MenuItem item)

}
