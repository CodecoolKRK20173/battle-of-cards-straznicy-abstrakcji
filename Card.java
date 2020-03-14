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
        int result;

        result = this.metascore - secondCard.metascore; 
        if(result > 0){
            System.out.println("Rafal's card is stronger");
        }else{
            System.out.println("Computer's card is stronger");
        }
        return result;
    }



}
