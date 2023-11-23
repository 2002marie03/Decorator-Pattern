package org.example.decorateur;

import org.example.composants.Boisson;

public class Chocolat extends Decorateur {

Boisson boisson;

    public Chocolat(Boisson boisson) {
        this.boisson = boisson;
    }

    public String getDiscription(){

        return boisson.getDiscription()+"Avec Chocolat";
    }
    @Override
    public double cout() {
        return boisson.cout()+2;
    }
}
