package org.example.composants;

public class Deca extends Boisson{


    public String getDiscription(){
        discription="Deca";
        return discription;
    }

    @Override
    public double cout() {
        return 6;
    }
}
