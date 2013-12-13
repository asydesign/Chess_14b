/*
 Задача 1 Да се дефинира клас за представяне на шахматен офицер. 
 Да се създадат два обекта от този клас – единият чрез инициализация, 
 а другият чрез въвеждане от клавиатурата. 
 Да се изведат позициите на двете фигури и да се съобщи по какъв цвят се 
 движат двата офицера и единият може ли да вземе другия с един ход.

 */
package chess;

import java.util.Scanner;

public class KirilIvanov1 {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int playerX = 8;
        int playerY = 6;

        ChessFigure bishop1 = new Bishop(3, 1);
        bishop1.setColor("white");

        bishop1.info();
        bishop1.setPos(8, 6);

        System.out.println();

        Bishop bishop2 = new Bishop(playerX, playerY);
        bishop2.setColor("black");
        bishop2.info();

        System.out.println("Input new position x:");
        playerX = scr.nextInt();
        System.out.println("Input new position y:");
        playerY = scr.nextInt();
        bishop2.setPos(playerX, playerY);

        Player myPlayer = new Player();
        myPlayer.colision(bishop1, bishop2);
    }
}
