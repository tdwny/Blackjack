package com.game.blackjack.controller;

import com.game.blackjack.cardsAndDecks.classes.CardFactory;
import com.game.blackjack.cardsAndDecks.classes.PlayingCard;
import com.game.blackjack.gameSequence.classes.ModelV2;
import com.game.blackjack.gameSequence.classes.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("blackjack")
public class Controller {

    @Autowired
    CardFactory cardFactory;
    Player player;

    @GetMapping
    public PlayingCard game(){

        player

    }

}
