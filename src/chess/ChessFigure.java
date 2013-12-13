/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chess;


public class ChessFigure {
    
   public void setColor (String color){
        
    } 
  
   public void setPos(int newX, int newY){
   }
   
    public int getX(){
        return 0;
    }
     public int getY(){
        return 0;
    }
  public void info(){
    
   }
    public boolean isWhitePlace(int x, int y){
         boolean whitePlace = false;
         for (int i = 0; i < 9; i++) {
            if (((x%2==0)&&(y%2!=0))||((x%2!=0)&&(y%2==0))) {
                whitePlace = true;
            }
        }
         if (whitePlace == true) {
            System.out.println("This is white place.");
        } else {
            System.out.println("This is black place.");
        }
        return whitePlace;
    }
   public String nameFigure(){
       return null;
       
   }
    
    
}
