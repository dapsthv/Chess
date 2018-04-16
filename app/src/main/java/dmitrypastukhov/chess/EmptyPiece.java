package dmitrypastukhov.chess;

/**
 * Created by DmitryPastukhov on 4/10/2018.
 */

public class EmptyPiece extends Piece {


    public EmptyPiece(String name, String player, Playground board) {
        super (name, player, board);
      }

      @Override public boolean isEmpty(){
        return true;
      }
}
