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
        int playerX;
        int playerY;

        ChessFigure bishop1 = new Bishop();
        bishop1.setColor("white");

        bishop1.info();
        bishop1.setPos(3,1);

        System.out.println();

        ChessFigure bishop2 = new Bishop();
        bishop2.setColor("black");
        bishop2.info();

        System.out.println("Input position x:");
        playerX = scr.nextInt();
        System.out.println("Input position y:");
        playerY = scr.nextInt();
        bishop2.setPos(playerX, playerY);

        System.out.println();
        
        Player myPlayer1 = new Player();
        myPlayer1.colision(bishop1, bishop2);
        
        System.out.println();
        System.out.println();
        
        ChessFigure horse1 = new Horse();
        horse1.setColor("white");

        horse1.info();
        horse1.setPos(4,4);

        System.out.println();

        ChessFigure horse2 = new Horse();
        horse2.setColor("black");
        horse2.info();

        System.out.println("Input position x:");
        playerX = scr.nextInt();
        System.out.println("Input position y:");
        playerY = scr.nextInt();
        horse2.setPos(playerX, playerY);
        
        System.out.println();
        
        Player myPlayer2 = new Player();
        myPlayer2.colision(horse1, horse2);
        
    }
}
