import java.io.FileNotFoundException;
import java.util.Comparator;

public class Table {

    private int roundNumber = 1;

    CardDao cardDao = new CSVCardDao();
    Deck deck = new Deck(cardDao.getCardFromFile());
    Gamer gamer = new Gamer(deck.getGamerCards());
    Computer computer = new Computer(deck.getComputerCards());

    Hand gamerHand = gamer.getHand();
    Hand computerHand = computer.getHand();

    View view = new View();

    public Table() throws FileNotFoundException{

    }

    public Comparator<Card> createComparator(){

        Comparator<Card> comparator =  null;
        int choice;

        if(roundNumber % 2 == 0){
            choice = computer.getInputFromComputer();
        }
        else{
            choice = gamer.getInput();
        }

        switch(choice){
            case 1:
                comparator = new MetascoreComparator();
                return comparator;
            case 2:
                comparator = new UserScoreComparator();
                return comparator;
            case 3:
                comparator = new NumberOfCopiesComparator();
                return comparator;
            case 4:
                comparator = new OpeningMonthIncomeComparator();
                return comparator;
            }
            return comparator;
    }

	public void playRound(){

        Card playerCard = gamer.getHand().passCard();
        Card computerCard = computer.getHand().passCard();
        
        view.displayGameInfo(gamer, computer);
        view.displayCardAttributes(playerCard);
        view.displayCardAttributes(computerCard);


        Comparator<Card> comparator = createComparator();

        int result = comparator.compare(playerCard, computerCard);
        
        addPoints(result);

        System.out.println(result);

        gamerHand.removeCard();
        computerHand.removeCard();  
        roundNumber++;
    }

    public void addPoints(int result){

        if(result > 0){
            gamer.setPoints();
        }else if(result < 0){
            computer.setPoints();
        }else{
            System.out.println("Cards are equal.");
        }
    }

    public void playGame(){

        view.displayHelloMessage();
        gamer.setName(gamer.getNameFromUser());
        view.clearScreen();
        while(roundNumber < 5){
            playRound();
        }
        
    }
}