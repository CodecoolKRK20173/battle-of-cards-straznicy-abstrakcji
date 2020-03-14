import java.util.ArrayList;
import java.util.List;

public class Card implements Comparable<Card> {

    private String name;
    private int metascore;
    private int userScore;
    private int numberOfCopies;
    private int openingMonthIncome;


    public Card(String name, int metascore, int userScore, int numberOfCopies, int openingMonthIncome){
        this.name = name;
        this.metascore = metascore;
        this.userScore = userScore;
        this.numberOfCopies = numberOfCopies;
        this.openingMonthIncome = openingMonthIncome;
        
    }

    public String getName(){
        return name;
    }

    public int getMetascore(){
        return metascore;
    }

    public int getUserScore(){
        return userScore;
    }

    public int getNumberOfCopies(){
        return numberOfCopies;
    }

    public int getOpeningMonthIncome(){
        return openingMonthIncome;
    }

    @Override
    public int compareTo(Card secondCard) {
        List<Integer> firstCardAttribute = new ArrayList<Integer>();
        List<Integer> secondCardAttribute = new ArrayList<Integer>();
        int result;

        firstCardAttribute.add(this.metascore);
        firstCardAttribute.add(this.userScore);
        firstCardAttribute.add(this.numberOfCopies);
        firstCardAttribute.add(this.openingMonthIncome);

        secondCardAttribute.add(secondCard.metascore);
        secondCardAttribute.add(secondCard.userScore);
        secondCardAttribute.add(secondCard.numberOfCopies);
        secondCardAttribute.add(secondCard.openingMonthIncome);

        result = firstCardAttribute.get(0) - secondCardAttribute.get(0);
        if(result == 0){
            
        }
       
        return result;
    }



}
