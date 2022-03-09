package com.leonardo.OOP;

public class ArrayOfObjects {
    public static void main(String[] args) {

        Food[] refrigerator = new Food[3];

        Food food1 = new Food("Pizza");
        Food food2 = new Food("Lasagna");
        Food food3 = new Food("Chilaquiles");

        refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3;

        System.out.println(refrigerator[0].name);

        //Podemos declarar un nuevo arreglo más rápido
        Food[] nuevoRefri = {food1, food2, food3};
        System.out.println(nuevoRefri[1]);
    }
}
