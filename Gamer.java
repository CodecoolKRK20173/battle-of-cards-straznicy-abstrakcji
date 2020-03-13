import java.util.List;
import java.util.Scanner;

public class Gamer extends AbstractPlayer {

    public int playerChoice;

    public Gamer(List<Card> cards){
        super(cards);

    }

    public String getName(){
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        scan.close();
        return name;

    }

    public int getInput(){
        Scanner scan = new Scanner(System.in);
        playerChoice = scan.nextInt();
        while(playerChoice < 1 || playerChoice > 4){
            System.out.println("Podaj liczbe od 1 do 4");
            playerChoice = scan.nextInt();
        }
        scan.close();
        return playerChoice;

    }
   
}