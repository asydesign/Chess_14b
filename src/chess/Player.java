package chess;

/**
 *
 * @author photo
 */
public class Player {

    public void colision(ChessFigure bishop1, ChessFigure bishop2) {
        if ((bishop1.getX() == bishop2.getX()) && (bishop1.getY() == bishop2.getY())) {
            System.out.println("Bishop1 is over Bishop2");
        }
        if (Math.abs(bishop1.getX() - bishop2.getX()) == Math.abs(bishop1.getY() - bishop2.getY())) {
            System.out.println("Bishop1 can get Bishop2");
        }
    }
}
