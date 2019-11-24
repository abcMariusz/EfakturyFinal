package pl.abc.faktury.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EdycjaFakturController {
    @GetMapping("/edycjafaktur")
    public String login(){
        return "edycjafaktur";
    }
}
