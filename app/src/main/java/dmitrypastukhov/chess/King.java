package dmitrypastukhov.chess;

/**
 * Created by DmitryPastukhov on 4/6/2018.
 */

public class King extends Piece {

//attributes

//methods

    public King (String name, String player, Playground board){
        super(name, player, board);

    }

    public boolean checkIfMovePossible(int x, int y, int newX, int newY){


        if (-1 <= x-newX && x-newX <= -1 && -1<= y-newY && y-newY<= 1) return true;
        else return false;

    }


    }
