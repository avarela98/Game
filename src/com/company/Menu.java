package com.company;

import java.util.Scanner;

public class Menu {
    Game game;
    ConfigGame configGame;
    private final Scanner sc = new Scanner(System.in);

    public Menu(Game game, ConfigGame configGame){
        this.game = game;
        this.configGame = configGame;
    }

    public void show(){
        menuPrincipal();
    }

    public void menuPrincipal() {
        int op;
        do {
            System.out.println("1. Jugar Dado");
            System.out.println("2. Jugar Parchis");
            System.out.println("3. Jugar Ajedrez");
            System.out.println("4. Exit");
            op = sc.nextInt();
            sc.nextLine();
            switch (op){
                case 1:
                    game.play();
                    break;
                case 2, 3:
                    System.out.println("Este juego no esta disponible");
                    System.out.println();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Has de triar 1, 2, 3 o 4");
            }
        } while(op !=4);
    }
}