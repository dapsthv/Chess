package dmitrypastukhov.chess;

/**
 * Created by DmitryPastukhov on 4/9/2018.
 */
public class Playground {
    //Attributes
    public Piece[][] board;
    //Methods
    //Constructor
    public Playground(){

        Piece board [][] = new Piece[8][8];
        board [0][0]=new Tower("T1","A", this);
        board [0][1]=new Knight("Kn1","A", this);
        board [0][2]=new Bishop("B1","A", this);
        board [0][3]=new King("K","A", this);
        board [0][4]=new Queen("Q","A", this);
        board [0][5]=new Bishop("B2","A",this);
        board [0][6]=new Knight("Kn2","A", this);
        board [0][7]=new Tower("T2","A", this);
        board [7][0]=new Tower ("T1","B",this);
        board [7][1]=new Knight ("Kn1","B", this);
        board [7][2]=new Bishop ("B1","B", this);
        board [7][3]=new King("K","B", this);
        board [7][4]=new Queen ("Q","B", this);
        board [7][5]=new Bishop ("B2","B",this);
        board [7][6]=new Knight ("Kn2","B", this);
        board [7][7]=new Tower ("T2","B",this);

        int a;
        for (a =0; a <=7; a = a +1){
            board[1][a]=new WhitePawn("p","A", this);
            board[6][a]=new BlackPawn("p","B", this );
            int b;
            for (b =0; b <=4; b = b +1){
                board [b][a]=new EmptyPiece("_","_", this);
            }
        }
    }

    public void updatePosition (int x1, int y1, int x2, int y2){
        board[x2][y2]=board[x1][y1];
        board[x1][y1]=new EmptyPiece ("_","_", this);
    }



    public void displayPlayground(){
        String name, player;
        int a;
        int b;
        for (a =0; a <=7; a = a +1){
            for (b=0;b<=7;b=b+1){
                    name=board[a][b].getName();
                    player=board[a][b].getPlayer();
                    System.out.print(name+player);

            }
            System.out.println("");
        }

    }
}
