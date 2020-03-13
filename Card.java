public class Card {

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

}
