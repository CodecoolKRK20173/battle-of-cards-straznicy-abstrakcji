import java.io.FileNotFoundException;

class Main {
    public static void main(String[] args) throws FileNotFoundException {
        CardDao cardDao = new CSVCardDao();

        Deck deck = new Deck(cardDao.getCardFromFile());
        deck.displaCards();

    }
}