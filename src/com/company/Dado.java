package com.company;

public class Dado {

    int dado = 0;
    int dado2 = 0;
    int dado3 = 0;

    public void jugar() {
        dado = (int) (Math.random()*6+1);
        dado2 = (int) (Math.random()*6+1);
        dado3 = (int) (Math.random()*6+1);
    }
}
