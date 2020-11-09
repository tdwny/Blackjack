package com.game.blackjack.cardsAndDecks.interfaces;


import com.game.blackjack.cardsAndDecks.classes.PlayingCard;

import java.util.ArrayList;

public interface PlayingCardFactory {

    PlayingCard getSingleCard(String criteria);
    ArrayList<PlayingCard> getDeckOfCards(String criteria, int numberOfDecks);

}
