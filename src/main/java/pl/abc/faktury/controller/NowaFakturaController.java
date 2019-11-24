package pl.abc.faktury.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class NowaFakturaController {

    @GetMapping("/dodawanienowejfaktury")
    public String login(){
        return "dodawanienowejfaktury";
    }
}
