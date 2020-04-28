package com.example.Tictactoe.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ui/game")
public class GameController {

    @GetMapping("/create")
    public String createNewGame() {
        return "createNewGame";
    }

}