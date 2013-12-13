package chess;


public class Horse extends ChessFigure{
     private int x;
    private int y;
    private String color;
    
    @Override
    public String nameFigure(){
       return "Horse";
   }
    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void info() { 
        System.out.println(color + " " + nameFigure());
        
    }


     public boolean move(int x, int y) {
        
     boolean rightPlace = false;
     
        for (int i = 0; i < 2; i++) {
            if (((x == this.x + (i*2)) && (y == this.y + i)) || ((x == this.x + (i*2)) && (y == this.y - i)) || ((x == this.x + i) && (y == this.y + (i*2)))||((x == this.x + i) && (y == this.y - (i*2))) || ((x == this.x - (i*2)) && (y == this.y + i)) || ((x == this.x - (i*2)) && (y == this.y - i)) || ((x == this.x - i) && (y == this.y + (i*2)))||((x == this.x - i) && (y == this.y - (i*2)))) {
                
                rightPlace = true;
            }
        }
        if (rightPlace == false) {
            
            System.out.println("Incorrect position!");
        } else {
            System.out.println("Position: (" + x + "," + y + ")");
        }

        return rightPlace;
    }


    @Override
    public void setPos(int x, int y) {
            this.x = x;
            this.y = y;
            move(x,y);
            isWhitePlace(x,y);
       
        
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

}
