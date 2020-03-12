
import java.util.List;

public class Deck {

    private List<Card> cards;

    public Deck(List<Card> cards){
        
        this.cards = cards;
    }

    public void displaCards(){
        for(Card card : cards){
            System.out.println(card.getName());
        }
    }
}