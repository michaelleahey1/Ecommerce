package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    //Objects
    private static double totalAmount = 0.0;
    private static final Product[] inventory = {
            new Product("Business Ritual Women's Long Sleeve Top", 65.39, "Apparel", 4,  "Blue",'L'),
            new Product("The Art of Computer Programming", 190.54, "Books", 9, "Donald E. Knuth"),
            new Product("Men's Business Casual Shirt", 57.10, "Apparel", 2, "Teal",'M'),
            new Product("Organic Turmeric Soap", 11.25, "Bath & Beauty", 1),
            new Product("Head First Design Pattern", 37.35, "Books", 3, "Eric Freeman")
    };

    //Methods
    public static void main(String[] args) {
        var userInput = 0;
        var scanner = new Scanner(System.in);
        //needed to use scanner to get the input
        while (true) {//while loop continues to run while the boolean is true
            displayMenu();
            userInput = scanner.nextInt();
            if (userInput >= 0 && userInput <= 4) {
                if (inventory[userInput].buy( )) {
                    System.out.println("Your purchase was successful.");
                    totalAmount += inventory[userInput].getPrice();
                } else {
                    System.out.println("out of stock.");
                }
            } else {
                break; // insures the loop ends immediately
            }
        }
        System.out.println("Thank you for shopping!" + totalAmount);
    }

    private static void displayMenu() {
        System.out.println("\nEnter the product index (0 to 4) you want to buy. To exit the shopping cart, enter any number other than 0 to 4");
        for (int i = 0; i < inventory.length; i++) {
            System.out.println(i + " : " + inventory[i].getName());
        }
    }
}