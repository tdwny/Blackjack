package com.game.blackjack.cardsAndDecks.classes;

//This class creates a new PlayingCard Object
import com.game.blackjack.cardsAndDecks.interfaces.Card;
import com.game.blackjack.cardsAndDecks.interfaces.Values;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlayingCard implements Card, Values {

    //Instance Variables
    private String suit;
    private String rank;
    private boolean colorBlack;
    private int points;

    //Constructor
    public PlayingCard(String suit, String rank, boolean colorBlack, int points) {
        this.suit = suit;
        this.rank = rank;
        this.colorBlack = colorBlack;
        this.points = points;
    }

    //Getters
    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    public int getPoints() {
        return points;
    }

    public boolean isColorBlack() {
        return colorBlack;
    }

    //getSingleCard will return the color (red or black), rank and suit
    public String displayCard() {
        if (colorBlack) {
            return this.rank + this.getSuit();
            //return "\033[0;37m" + this.rank + this.getSuit();
        } else {
            return this.rank + this.getSuit();
            //return "\033[0;31m" + this.rank + this.getSuit();
        }
    }

    public int pointValue(){
        return points;
    }

}