package org.example.decorateur;

import org.example.composants.Boisson;

public abstract class Decorateur extends Boisson {

    Boisson boisson;
    public String getDiscription(){
       return boisson.getDiscription();
    }
    @Override
    public double cout() {
        return boisson.cout();
    }
}
