package Problems.Tic_Tac_Toe;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Player player1=new Player("Name1", PlayingPiece.O);
        Player player2=new Player("Name2", PlayingPiece.X);
        Player player3=new Player("Name3", PlayingPiece.Z);
        List<Player> players=new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);

        Game game=new Game(4, players);
        game.startGame();
    }
}
