package org.example.homework4;

public class Task3 {
    public static void main(String[] args) {
        // price of the product
        double unitPrice = 10.0;
        // Quantity
        int quantity = 100;

        double totalCost = calculateTotalCost(unitPrice, quantity);
        System.out.println("Total cost of the product: " + totalCost);
    }

    public static double calculateTotalCost(double unitPrice, int quantity) {
        double discount = 0.0;

        if (quantity > 10 && quantity <= 20) {
            discount = 0.05;
        } else if (quantity > 20 && quantity <= 30) {
            discount = 0.1;
        } else if (quantity > 30 && quantity <= 80) {
            int additional = quantity - 30;
            discount = 0.12 + (additional / 10) * 0.004;
        } else if (quantity > 80) {
            discount = 0.13;
        }
        double totalCost = (unitPrice * quantity) * (1 - discount);
        return totalCost;
    }
}
