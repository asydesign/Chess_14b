package chess;

public class Bishop extends ChessFigure {

    private int x;
    private int y;
    private String color;
    private boolean rightPlace = false;

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

    @Override
    public void setPos(int x, int y) {
        if (isRightPlace(x, y)) {
            this.x = x;
            this.y = y;
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
