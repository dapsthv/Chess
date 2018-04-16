package dmitrypastukhov.chess;

/**
 * Created by DmitryPastukhov on 4/9/2018.
 */

public class Bishop extends Piece {

//attributes

//methods

    public Bishop (String name, String player, Playground board){
    super(name, player, board);
    }

    public boolean checkIfPossible(int x, int y, int newX, int newY) {


        if (newX - x == newY - y) return true;
        if  (x - newX == newY - y) return true;
        else return false;

    }

}