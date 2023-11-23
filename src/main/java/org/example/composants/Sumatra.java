package org.example.composants;

public class Sumatra extends Boisson{

    public String getDiscription(){
        discription="Sumatra";
        return discription;
    }
    @Override
    public double cout() {
        return 6;
    }
}
