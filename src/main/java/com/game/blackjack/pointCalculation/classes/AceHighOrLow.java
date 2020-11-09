package com.game.blackjack.pointCalculation.classes;

import com.game.blackjack.cardsAndDecks.classes.PlayingCard;
import com.game.blackjack.pointCalculation.interfaces.PlayingCardCalculator;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class AceHighOrLow implements PlayingCardCalculator {

    public int calculatePoints(ArrayList<PlayingCard> hand){
        int aceHigh = aceHigh(hand);
        return (aceHigh > 21 ? aceLow(hand) : aceHigh);
    }

    public int aceHigh(ArrayList<PlayingCard> hand){

        int points = 0;

        for (PlayingCard playingCard : hand){
            points += playingCard.pointValue();
        }

        return points;

    }

    public int aceLow(ArrayList<PlayingCard> hand){

        int points = 0;

        for (PlayingCard playingCard : hand){

            if (playingCard.getRank() == "A"){
                points += 1;
            } else {
                points += playingCard.pointValue();
            }
        }

        return points;

    }
}
