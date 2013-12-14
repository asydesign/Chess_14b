package chess;

/**
 *
 * @author photo
 */
public class Compair {

   public void colision(ChessFigure myFigure1, ChessFigure myFigure2) {
        if(myFigure1.nameFigure()=="Bishop"){
            if (Math.abs(myFigure1.getX() - myFigure2.getX()) == Math.abs(myFigure1.getY() - myFigure2.getY())) {
                System.out.println(myFigure1.nameFigure() + " can get "+ myFigure2.nameFigure());
            }else{
                System.out.println(myFigure1.nameFigure() + " can't get "+ myFigure2.nameFigure());
            }
            
        }
         if(myFigure1.nameFigure()=="Horse"){
              if( ((Math.abs(myFigure1.getX() - myFigure2.getX()) == 2) && (Math.abs(myFigure1.getY() - myFigure2.getY()) == 1)) || ((Math.abs(myFigure1.getX() - myFigure2.getX()) == 1) && (Math.abs(myFigure1.getY() - myFigure2.getY()) == 2)) ){
                   System.out.println(myFigure1.nameFigure() + " can get "+ myFigure2.nameFigure());
            }else{
                System.out.println(myFigure1.nameFigure() + " can't get "+ myFigure2.nameFigure());
            }
         }
        
         if ((myFigure1.getX() == myFigure2.getX()) && (myFigure1.getY() == myFigure2.getY())) {
                System.out.println(myFigure1.nameFigure()+ " is over "+myFigure2.nameFigure());
            }
    }   
   
}
