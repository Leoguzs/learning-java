package com.leonardo.OOP;

public class POOBasics {
    public static void main(String[] args) {
        Car toyota = new Car();
        toyota.brand = "Toyota";
        toyota.color = "Blue";
        toyota.year = 1998;

        toyota.on();
        System.out.println(toyota.brand);

        Human leonardo = new Human("Leonardo", 25, "Sociología");
        System.out.println(leonardo.name);
        leonardo.saludar();
        System.out.println(leonardo.toString());
        System.out.println(leonardo);

        ///un Humano 2
        Human juan= new Human("Juan José", 19, "Pedagogía");
        System.out.println(juan.name);

        Pizza pizzaPeper = new Pizza("Garlic", "Medium");
        Pizza pizzaPush = new Pizza("Garlic", "Big", "Mozarella");
    }
}
