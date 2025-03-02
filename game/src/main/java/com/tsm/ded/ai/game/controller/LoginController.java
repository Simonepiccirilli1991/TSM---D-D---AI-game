package com.tsm.ded.ai.game.controller;

import com.tsm.ded.ai.game.model.Player;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String welcome(){
        return "welcome";
    }

    @GetMapping("login")
    public String login(){
        return "login";
    }

    @GetMapping("nuova-partita")
    public String newSession(Model model){
        model.addAttribute("player", new Player()); // Ensure Player is a valid bean class
        return "nuova-partita";
    }
}
