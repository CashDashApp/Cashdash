package org.cashdash.models;

import org.cashdash.database.Database;

public class Product extends Item {
    private Category category;
    private String description;
    private String imageUrl;
    private double price;

    public Product(String name, Integer stock, String description, double price) {
        super(name, stock);
        this.description = description;
        this.price = price;
    }

    public Product(String name, Integer stock, String description, double price, Category category) {
        super(name, stock);
        this.description = description;
        this.price = price;
        this.category = category;
    }

    /*
     * for storing data from database
     */
    public Product(int id, String name, String description, Integer stock, double price) {
        super(id, name, stock);
        this.description = description;
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public double getPrice() {
        return price;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void getInfo() {
        
    }

    public int save() throws Exception {
        return Database.executeUpdate("UPDATE products SET name = ?, stock = ?, category_id = ?, description = ?, price = ? WHERE id = ?",
            super.getName(),
            super.getStock(),
            this.category.getId(),
            this.description,
            this.price,
            super.getId()
        );
    }
    
}
