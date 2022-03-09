package com.leonardo.Interfaces;

public class Pescado implements Presa, Depredador {
    @Override
    public void acechar() {
        System.out.println("El pez acecha");
    }

    @Override
    public void huir() {
        System.out.println("el pez huye");
    }
}
