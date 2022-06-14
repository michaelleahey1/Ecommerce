package org.example;

public class Product {
    //objects

    private  String name;
    private  Double price;
    private  String category;
    private  Integer quantity;
    private  String author;
    private String color;


    //constructors
    public Product(String name, Double price, String category, Integer quantity, String author, String color) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.author = author;
        this.color = color;
    }


    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //price
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    //categories
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    //Quantity
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    //author
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    //color
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", quantity=" + quantity +
                ", author='" + author + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
