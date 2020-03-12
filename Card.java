import java.util.List;

public class Card {
    private String name;
    private float metascore;
    private float userScore;
    private float numberOfCopies;
    private float openingMonthIncome;


    public Card(String name, float metascore, float userScore, float numberOfCopies, float openingMonthIncome){
        this.name = name;
        this.metascore = metascore;
        this.userScore = userScore;
        this.numberOfCopies = numberOfCopies;
        this.openingMonthIncome = openingMonthIncome;
        
    }

    public String getName(){
        return name;
    }

    public float getMetascore(){
        return metascore;
    }

    public float getUserScore(){
        return userScore;
    }

    public float getNumberOfCopies(){
        return numberOfCopies;
    }

    public float getOpeningMonthIncome(){
        return openingMonthIncome;
    }

}
