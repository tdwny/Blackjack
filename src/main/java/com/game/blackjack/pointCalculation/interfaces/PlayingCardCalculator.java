package com.game.blackjack.pointCalculation.interfaces;

import com.game.blackjack.cardsAndDecks.classes.PlayingCard;

import java.util.ArrayList;

public interface PlayingCardCalculator {

    int calculatePoints(ArrayList<PlayingCard> hand);

}
