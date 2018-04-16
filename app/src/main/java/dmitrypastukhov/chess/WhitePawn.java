package dmitrypastukhov.chess;

/**
 * Created by DmitryPastukhov on 4/10/2018.
 */

public class WhitePawn extends Piece {

    public WhitePawn(String name, String player, Playground board){
        super(name, player, board);

    }

    public boolean checkIfPossible(int x, int y, int newX, int newY) {


        //if (Piece.alreadyMoved = true) {
           // if (newY-y==2) return true;}
        //if (Playground.thereIsAPieceToAttackWhitePawn = true){
            //if (newY-y==1 && newX-x ==1) return true;
            //if (newY-y==1 && newX-x==-1) return true;}
        if (newY-y==1) return true;
        else return false;
    }
}

