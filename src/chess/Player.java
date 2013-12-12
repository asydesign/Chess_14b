package chess;

/**
 *
 * @author photo
 */
public class Player {

    public void colision(ChessFigure bishop1, ChessFigure bishop2) {
        if ((bishop1.getX() == bishop2.getX()) && (bishop1.getY() == bishop2.getY())) {
            System.out.println("bishop1 is over bishop2");
        }
        if (Math.abs(bishop1.getX() - bishop2.getX()) == Math.abs(bishop1.getY() - bishop2.getY())) {
            System.out.println("bishop1 can get bishop2");
        }
    }
}
