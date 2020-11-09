package com.game.blackjack.gameSequence.interfaces;

import com.game.blackjack.cardsAndDecks.classes.PlayingCard;
import com.game.blackjack.gameSequence.enums.MenuSelection;
import com.game.blackjack.gameSequence.enums.PayoutType;
import com.game.blackjack.gameSequence.enums.WagerType;

import java.util.ArrayList;

public interface UserPlayer {

    //Getters
    String getPlayerName();
    ArrayList<PlayingCard> getHand();
    int getCredits();
    boolean getBusts();
    int getPayoutAmount();
    PayoutType getPayoutType();
    boolean getHasBlackjack();

    //Setters
    void setCredits(int credits);
    void setBusts(boolean busts);
    void setPayoutAmount(int amount);
    void setPayoutType(PayoutType type);
    void setHasBlackjack(boolean hasIt);

    //Methods
    MenuSelection gameSequence(MenuSelection menuSelection);
    boolean creditCheck(WagerType wagerType, int wager);
    void playerHit(PlayingCard card);
    void displayCredits();
    void printCard(int elementToDraw);
    void handScoreDisplay();
    void menuOptions();
    boolean hit(PlayingCard card);
    boolean stay();
    boolean bustCheck(ArrayList<PlayingCard> hand);
    boolean doubleDown(PlayingCard card);
    boolean splitPair();
    boolean purchaseInsurance();
    boolean blackjackCheck(ArrayList<PlayingCard> hand);
    void playerBlackjack();

}
