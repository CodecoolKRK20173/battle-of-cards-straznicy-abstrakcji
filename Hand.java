import java.util.List;

public class Hand{

    private List<Card> cards;

    public Hand(List<Card> cards){
        this.cards = cards;
    }

    public Card passCard(){
        int firstCardIndex = 0;
        Card card = cards.get(firstCardIndex);
       return card;
    }
    
}