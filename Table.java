import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

public class Table {

    private int roundNumber = 1;

    CardDao cardDao = new CSVCardDao();
    Deck deck = new Deck(cardDao.getCardFromFile());
    Gamer gamer = new Gamer(deck.getGamerCards());
    Computer computer = new Computer(deck.getComputerCards());
    View view = new View();

    public Table() throws FileNotFoundException{

    }

	public void playRound(){

        
        Card playerCard = gamer.getHand().passCard();
        Card computerCard = computer.getHand().passCard();
        
        view.displayGameInfo(gamer, computer);
        view.displayCardAttributes(playerCard);
        Comparator<Card> comparator = null;
        int result = 0;

        switch(gamer.getInput()){
            case 1:
                comparator = new MetascoreComparator();
                result = comparator.compare(playerCard, computerCard);
                break;
            case 2:
                comparator = new UserScoreComparator();
                result = comparator.compare(playerCard, computerCard);
                break;
            case 3:
                comparator = new NumberOfCopiesComparator();
                result = comparator.compare(playerCard, computerCard);
                break;
            case 4:
                comparator = new OpeningMonthIncomeComparator();
                result = comparator.compare(playerCard, computerCard);
                break;
            }
        System.out.println(result);
        roundNumber++;
    }

    public void playGame(){
        view.displayHelloMessage();
        gamer.setName(gamer.getNameFromUser());
        view.clearScreen();
        playRound();

        
    }
}