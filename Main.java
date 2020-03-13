import java.io.FileNotFoundException;

class Main {

    
    public static void main(String[] args) throws FileNotFoundException {
        CardDao cardDao = new CSVCardDao();
        Deck deck = new Deck(cardDao.getCardFromFile());
        Viev viev = new Viev();


        Gamer rafal = new Gamer(deck.getGamerCards());
        rafal.setName(rafal.getName());


        viev.displayCardAttributes(rafal.getHand().passCard());
        viev.displayChosenAttribure(rafal.getHand().passCard(), rafal.getInput());

    }
}