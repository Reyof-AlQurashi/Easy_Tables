/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easytables_;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class Menu {
    public Map<String, Double> Main_dishes;
    public Map<String, Double> Appetizers;
    public Map<String, Double> Desserts;
    public Map<String, Double> Drinks;
    public double TotalBill;


    public Menu() {
        Main_dishes = new HashMap<>();
        Appetizers = new HashMap<>();
        Desserts = new HashMap<>();
        Drinks =new HashMap<>();
        TotalBill = 0.0;
    }

    public void addMainDishes() {
        System.out.println("********** Main Dishes *************");
        Main_dishes.put("Butter Chicken Rice", 35.15);
        Main_dishes.put("Chicken Briyani", 40.35);
        Main_dishes.put("ALFREDO", 25.00);
        Main_dishes.put("CARBONARA", 26.00);
        Main_dishes.put("Briesd Beef Rice", 38.45);
        Main_dishes.put("Beef Meat Steak", 54.12);
        Main_dishes.put("Huwain Pizza", 34.50);
        Main_dishes.put("BBQ Pizza", 29.50);    
    }
    
    public void addAppetizers() {
        System.out.println("********** Appetizers *************");
        Appetizers.put("Antipasto Salad", 27.15);
        Appetizers.put("Caesar Salad", 24.35);
        Appetizers.put("Crispy Salad", 19.00);
        Appetizers.put("Ponir Mix Salad", 26.00);
        Appetizers.put("Pepper Potatoes", 21.50);
        Appetizers.put("French Fries", 19.45);
        Appetizers.put("Nuggets", 15.12);
          
    }

    public void addDesserts() {
        System.out.println("********** Desserts *************");
        Desserts.put("Tiramisu", 18.59);
        Desserts.put("Cheesecake With Berries", 23.35);
        Desserts.put("Creme Caramel", 22.00);
        Desserts.put("Blackberry Pie", 17.99);
        Desserts.put("Red Velvet Cake", 23.50);

    }
    
    public void addDrinks() {
        System.out.println("********** Drinks *************");
        Drinks.put("Water", 3.00);
        Drinks.put("Coke", 5.00);
        Drinks.put("Sprite", 5.00);
        Drinks.put("Passion Lady", 12.00);
        Drinks.put("Blackberry Juice", 10.99);
        Drinks.put("Orange Juice", 10.99);
        Drinks.put("Lemon Juice", 10.99);


    }
    public void printMenu() {
        System.out.println("---------------------Menu-------------------------");
        
        addMainDishes();
        for (Map.Entry<String, Double> entry : Main_dishes.entrySet()) {
            String dish = entry.getKey();
            double price = entry.getValue();
            System.out.println(dish + " - $" + price);
            System.out.println("");
        }
        
       
        addAppetizers();
        for (Map.Entry<String, Double> entry : Appetizers.entrySet()) {
            String dish = entry.getKey();
            double price = entry.getValue();
            System.out.println(dish + " - $" + price);
            System.out.println("");
     }
        
        addDesserts();
        for (Map.Entry<String, Double> entry : Desserts.entrySet()) {
            String dish = entry.getKey();
            double price = entry.getValue();
            System.out.println(dish + " - $" + price);
            System.out.println("");
        }
        
       
        addDrinks();
        for (Map.Entry<String, Double> entry : Drinks.entrySet()) {
            String dish = entry.getKey();
            double price = entry.getValue();
            System.out.println(dish + " - $" + price);
            System.out.println("");
        }
    }
    
public double takeOrder() {
        Scanner scanner = new Scanner(System.in);
        String order;
        double totalBill = 0.0;

        System.out.println("Welcome to the restaurant menu!");
        printMenu();
        System.out.println("Enter your order items (separated by commas):");
        order = scanner.nextLine();

        String[] items = order.split(",");
        for (String item : items) {
            item = item.trim();
            if (Main_dishes.containsKey(item)) {
                totalBill += Main_dishes.get(item);
            } else if (Appetizers.containsKey(item)) {
                totalBill += Appetizers.get(item);
            } else if (Desserts.containsKey(item)) {
                totalBill += Desserts.get(item);
            } else if (Drinks.containsKey(item)) {
                totalBill += Drinks.get(item);
            }
        }
        return totalBill;
    }
    
}
