package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {

 // Store the item name, unit price, and quantity

        String itemName = "apples";
        double itemPrice = 2.50;
        int quantity = 3;

// Build and print : EX. "You bought 3 apples for $7.10
        double totalPrice = itemPrice * quantity;
        System.out.println("You bought " + quantity + " " + itemName
                + " for $" + totalPrice);
    }
}
