package org.example;

import org.example.composants.Boisson;
import org.example.composants.Sumatra;
import org.example.decorateur.Chocolat;

public class Main {
    public static void main(String[] args) {

        Boisson boisson;
        boisson=new Sumatra();
        System.out.println(boisson.getDiscription());
        System.out.println(boisson.cout());
        boisson=new Chocolat(boisson);
        System.out.println(boisson.getDiscription());
        System.out.println(boisson.cout());
    }
}