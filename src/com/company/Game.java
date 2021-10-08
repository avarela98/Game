package com.company;

import java.util.Scanner;

public class Game {
    private final Scanner sc = new Scanner(System.in);
    private ConfigGame configGame;
    private final Menu menuPrincipal;
    final Dado dado;
    String op;
    private final Player[] jugador = new Player[2];

    public Game() {
        menuPrincipal = new Menu(this, configGame);
        configGame = new ConfigGame();
        dado = new Dado();
        this.jugador[0] = new Player();
        this.jugador[1] = new Player();
        jugador[0].setName("Jugador" + 1);
        jugador[1].setName("Jugador" + 2);
    }

    public void start() {
        menuPrincipal.show();
    }

    public void play() {
        System.out.println("Cantidad de dados: " + configGame.getDado());
        System.out.println("Cantidad de jugadores " + configGame.getJugador());
        System.out.println("Tirando...");
        System.out.println();
        for (int i = 0; i < configGame.getJugador(); i++) {
            jugador[i].dado.jugar();
            System.out.println(jugador[i].getName() + " ha sacado el numero " + jugador[i].dado.dado + " " + jugador[i].dado.dado2 + " " + jugador[i].dado.dado3);

            if (jugador[i].dado.dado == jugador[i].dado.dado2 && jugador[i].dado.dado2 == jugador[i].dado.dado3){
                jugador[i].setWin(true);
            }
        }

        jugador[1].setPartidas(1);
        jugador[0].setPartidas(1);

        if (jugador[0].getWin() && jugador[1].getWin()) {
            System.out.println("Empate");

        }else if (jugador[0].getWin()){
            System.out.println("El gandor es el " +jugador[0].getName());
            jugador[0].setVictorias(1);
            jugador[1].setDerrotas(1);
            jugador[0].setWin(false);
        }else if (jugador[1].getWin()){
            System.out.println("El gandor es el " +jugador[1].getName());
            jugador[1].setVictorias(1);
            jugador[0].setDerrotas(1);
            jugador[1].setWin(false);
        }else{
            System.out.println("Nadie a ganado esta ronda!");
        }

        System.out.println();
        System.out.print("Quieres seguir? ");
        op = sc.nextLine();
        System.out.println();
        if (op.equals("y")){
            play();
        }else{
            for (int i = 0; i < configGame.getJugador(); i++) {
                System.out.println(jugador[i].getName() + " el ganador es el " + jugador[i].getVictorias() + ", el perdedor es el " + jugador[i].getDerrotas() + " y en total ha jugado " + jugador[i].getPartidas() + " partidas.");
            }
            System.out.println();
        }
    }
}
