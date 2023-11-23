package org.example.composants;

public class Expresso extends Boisson{

    public String getDiscription(){
        discription="Expresso";
        return discription;
    }
    @Override
    public double cout() {
        return 6;
    }
}
