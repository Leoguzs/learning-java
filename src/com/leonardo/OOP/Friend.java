package com.leonardo.OOP;

public class Friend {
    String name;
    static int numberOfFriends;
    Friend(String name){
        this.name = name;
        numberOfFriends++;
    }
    static void info(){
        System.out.println("Tu tienes " + numberOfFriends + " amigos");
    }
}
