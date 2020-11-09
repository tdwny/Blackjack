package com.game.blackjack.gameSequence.classes;

import com.game.blackjack.cardsAndDecks.classes.PlayingCard;
import com.game.blackjack.gameSequence.interfaces.PointsCalculator;
import com.game.blackjack.pointCalculation.classes.AceHighOrLow;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class ThePointsCalculator implements PointsCalculator {

    private AceHighOrLow aceHighOrLow;

    public ThePointsCalculator(AceHighOrLow aceHighOrLow) {
        this.aceHighOrLow = aceHighOrLow;
    }

    public int calculatePoints(ArrayList<PlayingCard> hand, boolean isDealer, boolean showDealerHand) {
        if (!isDealer || (isDealer && showDealerHand)) {
            return aceHighOrLow.calculatePoints(hand);
        } else {
            return hand.get(0).pointValue();
        }
    }

    public int calculatePoints(ArrayList<PlayingCard> hand, boolean isDealer) {
        return calculatePoints(hand, isDealer, true);
    }

    public int calculatePoints(ArrayList<PlayingCard> hand) {
        return calculatePoints(hand, false, true);
    }

}
