package Problems.Tic_Tac_Toe;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Game {
    Board board;
    Deque<Player> turn;

    Game(Integer size,List<Player> players){
       board=new Board(size, players.size());
       turn=new ArrayDeque<>();
       for(int i=0;i<players.size();i++){
        turn.addLast(players.get(i));
       }
    }

    void startGame(){
        Boolean noWinner=true;
        while(noWinner){

            System.out.println("Current board...");
            board.printBoard();

            System.out.print("Enter row-col:");
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            String[] values=s.split("-");
            int inputRow=Integer.valueOf(values[0]);
            int inputCol=Integer.valueOf(values[1]);

            Player currentPlayer=turn.getFirst();
            turn.removeFirst();

            Boolean isInputValid=board.validateInput(inputRow,inputCol);
            if(isInputValid==false){
                System.out.println("Input is not valid.Please try again");
                turn.addFirst(currentPlayer);
                continue;
            }

            board.setPiece(inputRow,inputCol,currentPlayer.getPlayingPiece());
            //System.out.println("After setting...");
            //board.printBoard();

            String status=board.checkGameStatus(inputRow,inputCol,currentPlayer.getPlayingPiece());

            if(status.equals("Win")){
                System.out.print(currentPlayer.getName()+" won the game!");
                noWinner=false;
                break;
            }

            if(status.equals("Draw")){//draw
                break;
            }
            turn.addLast(currentPlayer);

        }
        if(noWinner==true){
            System.out.println("Game is draw!");
        }
    }
}
