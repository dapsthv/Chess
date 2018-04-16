package dmitrypastukhov.chess;

/**
 * Created by DmitryPastukhov on 4/10/2018.
 */

 public class Knight extends Piece {

//attributes

//methods

    public Knight(String name, String player, Playground board) {
        super (name, player, board);

    }

    public boolean checkIfPossible(int x, int y, int newX, int newY) {


        if (newX - x == 2 && newY - y == 1) return true;
        if (newX - x == -2 && newY - y == 1) return true;
        if (newX - x == 2 && newY - y == -1) return true;
        if (newX - x == -2 && newY - y == -1) return true;
        if (newX - x == 1 && newY - y == 2) return true;
        if (newX - x == -1 && newY - y == 2) return true;
        if (newX - x == 1 && newY - y == -2) return true;
        if (newX - x == -1 && newY - y == -2) return true;
        else return false;
    }
}
