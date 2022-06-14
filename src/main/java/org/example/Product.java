package org.example;

public class Product {
    //objects

    private  String name = new String ("Complete Works of Poe");
    private  Double price = new Double(25.00);
    private  String category = new String ("fiction");
    private  Integer quantity = new Integer(1);
    private  String author = new String( "Edgar Alan Poe" );
    private String color = new String("black");


    //constructors
    public Product(String name, Double price, String category, Integer quantity, String author, String color) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.author = author;
        this.color = color;
    }

}
