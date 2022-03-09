package com.leonardo.basics;

import java.util.ArrayList;

public class TwoDArrayLists {
    public static void main(String[] args) {
        //Los arreglos de lista 2D son listas dentro de listas
        //creando tres lsitas para diferentes productos
        ArrayList<String> listaPanaderia = new ArrayList<>();
        listaPanaderia.add("Pasta");
        listaPanaderia.add("Donas");
        listaPanaderia.add("Conchas");

        ArrayList<String> listaProductos= new ArrayList<>();
        listaProductos.add("Pasta dental");
        listaProductos.add("Rastrillo");
        listaProductos.add("Juguete");

        ArrayList<String> listaBebidas = new ArrayList<>();
        listaBebidas.add("Coca Cola");
        listaBebidas.add("Jarrito");

        System.out.println(listaBebidas);

        //Creando una lista para todo
        ArrayList<ArrayList<String>> tiendaDeAbarrotes = new ArrayList<>();
        tiendaDeAbarrotes.add(listaBebidas);
        tiendaDeAbarrotes.add(listaPanaderia);
        tiendaDeAbarrotes.add(listaProductos);
        System.out.println(tiendaDeAbarrotes.get(0).get(0));

    }
}
