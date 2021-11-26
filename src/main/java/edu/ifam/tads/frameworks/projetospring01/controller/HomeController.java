package edu.ifam.tads.frameworks.projetospring01.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    public String index(){
        System.out.println("Funcionou!");
        return "Funcionou no Browser";
    }
}
