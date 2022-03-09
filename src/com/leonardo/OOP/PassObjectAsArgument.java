package com.leonardo.OOP;

public class PassObjectAsArgument {
    public static void main(String[] args) {


        Car car= new Car();
        car.brand = "Tesla";

        Garage garage = new Garage();
        garage.park(car);

        System.out.println(Friend.numberOfFriends);
        Friend rafael = new Friend("Rafael");
        System.out.println(rafael.name + " " + rafael.numberOfFriends);

        Friend patricio = new Friend("Patricio");
        System.out.println(patricio.numberOfFriends);
        Friend.info();
    }
}
