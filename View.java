public class View {


    public void displayCardAttributes(Card card){

        System.out.println("\n\nTwoja obecna karta:");
        System.out.println(card.getName()+"\n");
        System.out.println("1. Metascore: " + card.getMetascore());
        System.out.println("2. User score: " + card.getUserScore());
        System.out.println("3. Number of copies sold: " + card.getNumberOfCopies());
        System.out.println("4. First month imcome (in milions): " + card.getOpeningMonthIncome());
        System.out.println("\n"+"Which attribute you choose to play? : ");
    }
    
    public void displayChosenAttribure(Card card, int choosenAttribute){
        if(choosenAttribute == 1){
            System.out.println("Metascore: " + card.getMetascore());
        }else if(choosenAttribute == 2){
            System.out.println("User score: " + card.getUserScore());
        }else if(choosenAttribute == 3){
            System.out.println("Number of copies sold: " + card.getNumberOfCopies());
        }else if(choosenAttribute == 4){
            System.out.println("First month imcome (in milions): " + card.getOpeningMonthIncome());
        }
    }
    
    public void displayHelloMessage(){
        System.out.println("\n Hello gamer !\n Welcome to Abstract Defenders Battle of Cards !\n\n Please tell us your name: ");
        
    }
    
    public void displayGameInfo(Gamer gamer, Computer comp){
        String gameInfo = String.format("%1$s : %2$s vs %3$s : %4$s", gamer.getName(), gamer.getPoints(), comp.getName(), comp.getPoints()); 
        System.out.println(gameInfo);
    }

    public void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}