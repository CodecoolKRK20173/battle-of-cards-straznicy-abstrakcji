import java.io.FileNotFoundException;

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
        // tutaj ma być metoda z view która pokazuje punkty i imiona
        Card playerCard = gamer.getHand().passCard();
        Card computerCard = computer.getHand().passCard();
        int result = playerCard.compareTo(computerCard);
        System.out.println(result);
        

        
        
        
        roundNumber++;
    }

    public void playGame(){
        gamer.setName(gamer.getNameFromUser());

        
    }
}