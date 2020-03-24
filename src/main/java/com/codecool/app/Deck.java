package com.codecool.app;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    private List<Card> cards;

    private List<Card> gamerCards;
    private List<Card> computerCards;

    public Deck(List<Card> cards){
        computerCards = new ArrayList<>();
        gamerCards = new ArrayList<>();
        this.cards = cards;
        drawCards();
    }

    private void drawCards(){
        int counter = 0;
        for(Card card : cards){
            if(counter % 2 == 0){
                gamerCards.add(card);
                counter++;
            }else{
                computerCards.add(card);
                counter++;
            }
        }
    }

    public List<Card> getGamerCards(){
        return gamerCards;
    }

    public List<Card> getComputerCards(){
        return computerCards;
    }

}