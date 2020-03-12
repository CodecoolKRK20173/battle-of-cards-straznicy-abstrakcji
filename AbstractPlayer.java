
public abstract class AbstractPlayer {
    
    private String name;
    private Hand hand;
    private int points;


    public AbstractPlayer(String name,Hand hand, int points){
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