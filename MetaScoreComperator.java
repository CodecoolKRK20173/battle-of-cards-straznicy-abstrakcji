import java.util.Comparator;

public class MetaScoreComperator implements Comparator<Card>{


    @Override
    public int compare(Card firstCard, Card secondCard) {
        int result;
        result = firstCard.getMetascore() - secondCard.getMetascore();
        if(result == 0){
            System.out.println("equal");
        }
        return result;
    }

}