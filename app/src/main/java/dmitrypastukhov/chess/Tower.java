package dmitrypastukhov.chess;

/**
 * Created by DmitryPastukhov on 4/10/2018.
 */

public class Tower extends Piece {

//attributes

//methods

    public Tower(String name, String player, Playground board){
        super(name, player, board);

    }

    public boolean checkIfPossible(int x, int y, int newX, int newY) {


        if (newX == x && newY - y >= -7 && newY - y <= 7) return true;
        if (newY == y && newX - x >= -7 && newX - x <= 7) return true;
        else return false;
    }
}