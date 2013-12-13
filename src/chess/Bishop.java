package chess;

public class Bishop extends ChessFigure {

    private int x;
    private int y;
    private String color;
    

    public Bishop(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void info() {
        System.out.println(color + " Bishop with first position: (" + x + "," + y + ")");

    }

    public boolean isRightPlace(int x, int y) {
     boolean rightPlace = false;
        for (int i = 0; i < 9; i++) {
            if (((x == this.x + i) && (y == this.y + i)) || ((x == this.x - i) && (y == this.y - i)) || ((x == this.x + i) && (y == this.y - i)) || ((x == this.x + i) && (y == this.y - i))) {
                rightPlace = true;
            }
        }
        if (rightPlace == false) {
            System.out.println("Incorrect position!");
        } else {
            System.out.println("New position: (" + x + "," + y + ")");
        }

        return rightPlace;
    }
    public boolean isWhitePlace(int x, int y){
        boolean whitePlace = false;
         for (int i = 0; i < 9; i++) {
            if ((x%2==0)&&(y%2!=0)) {
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

    @Override
    public void setPos(int x, int y) {
        
        if (isRightPlace(x,y)) {
            this.x = x;
            this.y = y;
            isWhitePlace(x,y);
        }
        
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
