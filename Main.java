import java.io.FileNotFoundException;
import java.util.List;

class Main {
    public static void main(String[] args) throws FileNotFoundException {
        CardDao cardDao = new CSVCardDao();
        Deck deck = new Deck(cardDao.getCardFromFile());
        
        Gamer player1 = new Gamer("dupa", deck.getGamerCards());
        player1.getHand().display();
        player1.getInput();
        System.out.println(player1.playerChoice);

    }
}