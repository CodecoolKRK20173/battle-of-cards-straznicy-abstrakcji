import java.util.List;

public class Hand{

    private List<Card> cards;
    private int firstCardIndex = 0;

    public Hand(List<Card> cards){
        this.cards = cards;
    }

    public Card passCard(){
        Card card = cards.get(firstCardIndex);
       return card;
    }

    public void removeCard(){
        cards.remove(firstCardIndex);
    }
}