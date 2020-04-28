package com.example.Tictactoe.ui;

@Controller
@RequestMapping("/ui/game")
public class GameController {

    @GetMapping("/create")
    public String createNewGame() {
        return "createNewGame";
    }

}