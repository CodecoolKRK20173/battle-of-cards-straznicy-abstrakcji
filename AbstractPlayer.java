import java.util.List;

public abstract class AbstractPlayer {
        
    private String name;
    private Hand hand;
    private int points = 0;


    public AbstractPlayer(List<Card> cards){
        this.hand = new Hand(cards);
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

    public void setPoints(){
        points++;
    }

    public void setName(String playerName){
        this.name = playerName ;
    }
}