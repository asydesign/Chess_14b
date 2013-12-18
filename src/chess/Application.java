/*
 Задача 1 Да се дефинира клас за представяне на шахматен офицер. 
 Да се създадат два обекта от този клас – единият чрез инициализация, 
 а другият чрез въвеждане от клавиатурата. 
 Да се изведат позициите на двете фигури и да се съобщи по какъв цвят се 
 движат двата офицера и единият може ли да вземе другия с един ход.

 */
package chess;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        //User asy = new User();
       Figure computerBishop = new Bishop("white",1,3);
        computerBishop.info();
       
        Scanner scr = new Scanner(System.in);
        int posX;
        int posY;
        System.out.print("Input position x: ");
        posX = scr.nextInt();
        System.out.print("Input position y: ");
        posY = scr.nextInt();
        
        Figure myBishop = new Bishop("black", posX, posY);
        myBishop.info();
        
        System.out.println();
        
        computerBishop.isCollision(myBishop);
      

//        Figure horse1 = new Horse();
//        horse1.setColor("white");
//
//        horse1.info();
//        horse1.setPos(4,4);
//
//        System.out.println();
//
//        Figure horse2 = new Horse();
//        horse2.setColor("black");
//        horse2.info();
//
//        System.out.println("Input position x:");
//        playerX = scr.nextInt();
//        System.out.println("Input position y:");
//        playerY = scr.nextInt();
//        horse2.setPos(playerX, playerY);
//        
//        System.out.println();
//        
//        Compair myPlayer2 = new Compair();
//        myPlayer2.colision(horse1, horse2);
    }
}
