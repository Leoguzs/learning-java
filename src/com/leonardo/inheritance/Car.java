package com.leonardo.inheritance;

public class Car extends Vehicle{
    String model;
    //@Override
    //le daremos a nuestra clase carro, su propia implementacion
    @Override
         void transporting(){
        System.out.println("Me estoy transportando en un carrito :3");
    }



}
