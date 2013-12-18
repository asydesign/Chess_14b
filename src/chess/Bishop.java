package chess;

public class Bishop extends Figure {

    private int x;
    private int y;
    private String color;

    public Bishop(String color, int x, int y) {
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

//    public boolean move() {
//        boolean rightPlace = false;
//        for (int i = 0; i < 8; i++) {
//            if (((x == this.x + i) && (y == this.y + i)) || ((x == this.x - i) && (y == this.y - i)) || ((x == this.x + i) && (y == this.y - i)) || ((x == this.x + i) && (y == this.y - i))) {
//                rightPlace = true;
//            }
//        }
//        if (rightPlace == false) {
//            System.out.println("Incorrect position!");
//        } else {
//            System.out.println("Position: (" + x + "," + y + ")");
//        }
//        return rightPlace;
//
//    }
    @Override
    public boolean isCollision(Figure myFigure) {
        boolean collision = false;
        if (Math.abs(x - myFigure.getX()) == Math.abs(y - myFigure.getY())) {
          collision = true;
          System.out.println("First Bishop can get second.");
        }else{
          System.out.println("First Bishop can't get second.");  
        }
        return collision;
    }

    @Override
    public void info() {
        if (isBW() == true) {
            System.out.println(color + " Bishop on white place: " + x + ", " + y);
        } else {
            System.out.println(color + " Bishop on black place: " + x + ", " + y);
        }

    }
}
