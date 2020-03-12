import java.util.ArrayList;
import java.util.List;

public class Hand{

    private List<Card> cards;


    public Hand(List<Card> cards){
        this.cards = cards;

    }
    public void display(){
        for(Card card : cards){
            System.out.println(card.getName());
        }
    }
    
}