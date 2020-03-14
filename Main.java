import java.io.FileNotFoundException;

class Main {

    
    public static void main(String[] args) throws FileNotFoundException {
        CardDao cardDao = new CSVCardDao();
        Deck deck = new Deck(cardDao.getCardFromFile());
        View view = new View();

        Computer comp = new Computer(deck.getComputerCards());
        view.displayName(comp);

        Gamer rafal = new Gamer(deck.getGamerCards());
        // rafal.setName(rafal.getNameFromUser());
        // view.displayName(rafal);
        
        Card computerCard = comp.getHand().passCard();
        Card rafalCard = rafal.getHand().passCard();
        rafalCard.compareTo(computerCard);


        // view.displayCardAttributes(rafal.getHand().passCard());
        // view.displayChosenAttribure(rafal.getHand().passCard(), rafal.getInput());


        

    }
}