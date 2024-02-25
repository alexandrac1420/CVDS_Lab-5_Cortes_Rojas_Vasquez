package com.guess.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/guess")
public class MainController {
    private GuessNumber number;

    @Autowired
    public MainController(GuessNumber number) {
        this.number = number;
    }

    @GetMapping
    public String showGuessForm(Model model) {
        model.addAttribute("prize", number.getPrize());
        return "guess";
    }

    @PostMapping
    public String guessNumber(@RequestParam("numero") int userNumber, Model model) {
        int guessNumber = number.generateGuessNumber();
        if(number.checkGuess(userNumber, guessNumber)) {
            model.addAttribute("message", "!Has ganado: $" + number.getPrize() + "!");
        }else{
            number.reducePrize();
            model.addAttribute("message", "Fallaste. Tu premio se reduce a: $" + number.getPrize());
        } 
        
        return "afterGuess";
    }
    @GetMapping("/reset")
    public String resetGame() {
        number.reset();
        return "redirect:/guess";
    }

}