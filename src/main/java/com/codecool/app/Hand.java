package com.codecool.app;

import java.util.List;

public class Hand{

    private List<Card> cards;
    private int firstCardIndex = 0;

    public Hand(List<Card> cards){
        this.cards = cards;
    }

    public List<Card> getCards(){
        return cards;
    }

    public Card passCard() {
        if(cards.isEmpty()){
            System.out.println("The hand is empty.");
            return null;
        }else return cards.get(firstCardIndex);
    }

    public void removeCard(){
        cards.remove(firstCardIndex);
    }

}