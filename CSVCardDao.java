import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CSVCardDao implements CardDao {
    private List<Card> cards = new ArrayList<Card>();
    // private ArrayList<String[]> cardList = new ArrayList<String[]>();
    @Override
    public List<Card> getCardFromFile() throws FileNotFoundException {

       File file = new File("games.csv");
       Scanner scan = new Scanner(file);
      
       while(scan.hasNextLine()){

        String[] line = scan.nextLine().split(", ");
        String name =  line[0];
        float metascore = Float.parseFloat(line[1]);
        float userScore = Float.parseFloat(line[2]);
        float numberOfCopies = Float.parseFloat(line[3]);
        float openingMonthIncome = Float.parseFloat(line[4]);
        Card card =  new Card(name,metascore,userScore,numberOfCopies,openingMonthIncome);
        cards.add(card);

       }
       scan.close();
       return cards;
    }
}
