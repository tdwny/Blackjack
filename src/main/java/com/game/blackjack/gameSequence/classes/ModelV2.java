package com.game.blackjack.gameSequence.classes;

import com.game.blackjack.cardsAndDecks.classes.CardFactory;
import com.game.blackjack.cardsAndDecks.classes.PlayingCard;
import com.game.blackjack.displayText.Text;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelV2 {

    @Autowired
    CardFactory cardFactory;

    public String menu(boolean newGame) {
        return Text.menu(newGame);
    }

    public PlayingCard getCard(){

        return cardFactory.getSingleCard("standardcard");

    }

}
