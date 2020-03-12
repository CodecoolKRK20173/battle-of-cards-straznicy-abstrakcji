import java.util.List;

public abstract class Player {
    
    private String name;
    private List<Card> hand;
    private int points;


    public Player(String name, List<Card> hand, int points){
        this.name = name;
        this.hand = hand;
        this.points = points;

    }

    public String getName(){
        return name;

    }

    public Hand getHand(){
        return hand;
    }

    public int getPoints(){
        return points;
    }


}