package com.game.blackjack.gameSequence.interfaces;

import com.game.blackjack.gameSequence.enums.MenuSelection;
import com.game.blackjack.gameSequence.enums.ThePlay;

public interface InputMapping {

    MenuSelection mainMenuSelection(int menuSelection);
    ThePlay thePlaySelection(int menuSelection);

}
