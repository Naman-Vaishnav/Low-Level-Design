package Problems.Tic_Tac_Toe;

public class Player {
    private String name;
    private PlayingPiece playingPiece;

    Player(String name,PlayingPiece playingPiece){
        this.name=name;
        this.playingPiece=playingPiece;
    }

    String getName(){
      return name; 
    }

    PlayingPiece getPlayingPiece(){
        return playingPiece;
    }

}
