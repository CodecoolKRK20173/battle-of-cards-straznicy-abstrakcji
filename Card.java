import java.util.ArrayList;
import java.util.Arrays;
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

        int result = 0;
        List<Integer> firstCardAttribute = Arrays.asList(this.metascore,this.userScore,this.numberOfCopies,this.openingMonthIncome);
        List<Integer> secondCardAttribute = Arrays.asList(secondCard.metascore,secondCard.userScore, secondCard.numberOfCopies, secondCard.openingMonthIncome);
       
        int index = 0;
        while(index < firstCardAttribute.size()){
            result = firstCardAttribute.get(index) - secondCardAttribute.get(index);
        if(result > 0){
            System.out.println("pierwsza karta lepsza");   
            return result;
        }
        else if(result < 0){
            System.out.println("druga karta wyzsza");
            return result;
        }
        else{
            index++;
            if(index == 4){
                System.out.println("Cards are equal.");
            }
        }
        }
        return result;
    }



}
