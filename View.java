public class View {


    public void displayCardAttributes(Card card){

        System.out.println("\n"+card.getName()+"\n");
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
    
    public void displayName(Gamer gamer){
        System.out.println("Player \n" + gamer.getName());
    }

    public void displayName(Computer comp){
        System.out.println(comp.getName());
    }
    
}