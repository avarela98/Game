package com.company;

public class ConfigGame {

    private final int dado;
    private final int jugador;

    public ConfigGame(){
        this.dado = 3;
        this.jugador = 2;
    }

    public int getDado() {
        return dado;
    }

    public int getJugador() {
        return jugador;
    }

}
