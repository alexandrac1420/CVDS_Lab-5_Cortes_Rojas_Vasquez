package com.guess.game;

import org.springframework.stereotype.Service;
import java.util.Random;
@Service
public class GuessNumber {

    private int prize = 100000;

    public boolean checkGuess(int userNumber, int guessNumber) {
        return userNumber == guessNumber;
    }

    public void reducePrize() {
        prize -= 10000;
    }

    public int getPrize() {
        return prize;
    }

    public void reset() {
        prize = 100000;
    }

    public int generateGuessNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        return randomNumber;
    }
}