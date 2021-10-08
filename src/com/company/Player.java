package com.company;

public class Player {
    private String name;
    private boolean win;
    private int partidas = 0, victorias = 0, derrotas = 0;
    Dado dado = new Dado();

    public Player() {
        win = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getWin() {return win;}

    public void setWin(boolean win) {
        this.win = win;
    }

    public void setVictorias(int victorias) {
        this.victorias += victorias;
    }

    public void setPartidas(int partidas) {
        this.partidas += partidas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas += derrotas;
    }

    public int getVictorias() {
        return victorias;
    }

    public int getPartidas() {
        return partidas;
    }

    public int getDerrotas() {
        return derrotas;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", win=" + win +
                '}';
    }
}
