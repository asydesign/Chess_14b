package chess;

public class Horse extends Figure {

    private int x;
    private int y;
    private String color;

    public Horse(String color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;

    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean isBW() {
        boolean whitePlace = false;
        for (int i = 0; i < 9; i++) {
            if (((x % 2 == 0) && (y % 2 != 0)) || ((x % 2 != 0) && (y % 2 == 0))) {
                whitePlace = true;
            }
        }

        return whitePlace;
    }

    @Override
    public boolean isCollision(Figure myFigure) {
        boolean collision = false;
        if (((Math.abs(x - myFigure.getX()) == 2) && (Math.abs(y - myFigure.getY()) == 1)) || ((Math.abs(x - myFigure.getX()) == 1) && (Math.abs(y - myFigure.getY()) == 2))) {
            collision = true;
            System.out.println("First Horse can get second");
        } else {
            System.out.println("First Horse can't get second");
        }
        return collision;
    }

    @Override
    public void info() {
        if (isBW() == true) {
            System.out.println(color + " Horse on white place: " + x + ", " + y);
        } else {
            System.out.println(color + " Horse on black place: " + x + ", " + y);
        }
    }

    /* 
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
     */
}
