package Problems.Tic_Tac_Toe;

public class Board {
    PlayingPiece[][] board;
    Integer size;
    int[][] rowCount;
    int[][] colCount;
    int[] diagCount;
    int[] revDiagCount;
    int filledPositions;

    Board(Integer size,Integer noOfPlayers){
        this.size=size;
        board=new PlayingPiece[size][size];
        rowCount=new int[size][noOfPlayers];
        colCount=new int[size][noOfPlayers];
        diagCount=new int[noOfPlayers];
        revDiagCount=new int[noOfPlayers];
        filledPositions=0;
    }

    void setPiece(Integer row,Integer col,PlayingPiece playingPiece){
        filledPositions++;
        board[row][col]=playingPiece;

        rowCount[row][playingPiece.ordinal()]++;
        colCount[col][playingPiece.ordinal()]++;
        if(row==col)diagCount[playingPiece.ordinal()]++;
        if(row+col==size-1)revDiagCount[playingPiece.ordinal()]++;
        
    }

    Boolean validateInput(Integer row,Integer col){
        Boolean inRange=(row>=0&&row<size&&col>=0&&col<size)?true:false;
        if(inRange==false)return false;
        if(board[row][col]!=null){
            return false;
        }
        return true;
    }

    String checkGameStatus(Integer row,Integer col,PlayingPiece playingPiece){
        Boolean rowMatch=true;
        Boolean colMatch=true;
        Boolean diagMatch=true;
        Boolean revDiagrowMatch=true;

        int pieceNo=playingPiece.ordinal();
        if(rowCount[row][pieceNo]!=size){
            rowMatch=false;
        }

        if(colCount[col][pieceNo]!=size){
            colMatch=false;
        }

        if(diagCount[pieceNo]!=size){
            diagMatch=false;
        }

        if(revDiagCount[pieceNo]!=size){
            revDiagrowMatch=false;
        }

        if(rowMatch||colMatch||diagMatch||revDiagrowMatch)return "Win";

        if(filledPositions==size*size)return "Draw";
        return "Continue";
               
    }

    void printBoard(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]!=null)System.out.print(board[i][j].toString()+"|");
                else {
                    System.out.print(" "+"|");
                }
            }
            System.out.println("");
        }
    }

 }
