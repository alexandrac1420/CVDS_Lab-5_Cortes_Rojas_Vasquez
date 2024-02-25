package com.guess.game;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import java.util.Random;

@Controller
public class MainController {

    private int score;
    private int randomNumber;

    @GetMapping("/guess")
    public String showGuessForm(Model model) {
        Random rand = new Random();
        randomNumber = rand.nextInt(9) + 1;
        score = 100000;
        model.addAttribute("score", score);
        return "guess";
    }

    @GetMapping("/reset")
    public String reset(Model model) {
        return "redirect:/guess";
    }

    @PostMapping("/guess")
    public String guessNumber(int number, Model model) {
        System.out.println("Random: " + randomNumber);
        System.out.println("Score: " + score);
        System.out.println("Number: " + number);
        if(randomNumber == number) 
            model.addAttribute("score", "!Has ganado, puntaje: " + score + "!");
        else{
            score -= 10000;
            model.addAttribute("score", "Puntaje: " + score);
        } 
        
        return "guess";
    }

}