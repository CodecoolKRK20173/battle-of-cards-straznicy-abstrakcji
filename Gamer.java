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
        while(playerChoice < 1 || playerChoice > 4){
            System.out.println("Podaj liczbe od 1 do 4");
        }
        return playerChoice;

    }

    




    
}