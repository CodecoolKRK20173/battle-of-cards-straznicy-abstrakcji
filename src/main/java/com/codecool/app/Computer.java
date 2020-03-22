package com.codecool.app;

import java.util.List;
import java.util.TreeMap;

public class Computer extends Player {

    TreeMap<Integer, String> calculatedAttributes = new TreeMap<>();

    public Computer(List<Card> cards) {
        super(cards);
        name = "Computer";
    }

    public void calculateBestAttribute() {
        Card actualCard = this.getHand().passCard();
        int maxScore = 100;
        int maxNumberOfCopies = 1200;
        int maxIncome = 8000;

        int metaScorePercent = actualCard.getMetascore() * 100 / maxScore;
        int userScorePercent = actualCard.getUserScore() * 100 / maxScore;
        int numberOfCopiePercent = actualCard.getNumberOfCopies() * 100 / maxNumberOfCopies;
        int incomePercent = actualCard.getOpeningMonthIncome() * 100 / maxIncome;

        calculatedAttributes.put(metaScorePercent, "metascore");
        calculatedAttributes.put(userScorePercent, "userScore");
        calculatedAttributes.put(numberOfCopiePercent, "number_of_copies");
        calculatedAttributes.put(incomePercent, "opening_income");
    }

    public int getInputFromComputer() {
        calculateBestAttribute();
        String bestAttribute = calculatedAttributes.lastEntry().getValue();
        if (bestAttribute.equals("metascore")) {
            return  1;
        } else if (bestAttribute.equals("userScore")) {
            return 2;
        } else if (bestAttribute.equals("numberOfCopies")) {
            return 3;
        } else {
            return 4;
        }
    }

}
