package dmitrypastukhov.chess;

/**
 * Created by DmitryPastukhov on 4/6/2018.
 */

public class Piece {

    String player;
    String name;
    private Playground board;



    public Piece(String theName, String thePlayer, Playground theBoard){
        name = theName;
        player = thePlayer;
        board = theBoard;

    }

    public boolean isEmpty(){
        return false;
    }

    public String getName(){

        return name;
    }

    public String getPlayer(){

        return player;
    }


}




