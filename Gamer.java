import java.util.List;
import java.util.Scanner;

public class Gamer extends AbstractPlayer {

    public int playerChoice;


    public Gamer(String name, List<Card> cards) {
        super(name, cards);

    }

    public int getInput(){
        Scanner scan = new Scanner(System.in);
        playerChoice = scan.nextInt();
        scan.close();
        return playerChoice;
       
        

    }




    
}