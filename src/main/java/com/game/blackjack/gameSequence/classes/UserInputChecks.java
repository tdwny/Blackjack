package com.game.blackjack.gameSequence.classes;

import com.game.blackjack.displayText.Text;
import com.game.blackjack.gameSequence.interfaces.InputChecks;

public class UserInputChecks implements InputChecks {

    public static int mainMenuCheck(String userInput, int minOption, int maxOption) {

        try {
            int returnInt = Integer.parseInt(userInput);

            for (int i = minOption; i <= maxOption; i++) {
                if (returnInt == i) {
                    return returnInt;
                }
            }
        } catch (NumberFormatException e) {
            return -1;
        }
        return -1;
    }

    public static boolean allowContinue(int input){

        if (input != -1){
            return true;
        } else {
            System.out.println(Text.invalidEntry + Text.tryAgain);
            return false;
        }

    }

}