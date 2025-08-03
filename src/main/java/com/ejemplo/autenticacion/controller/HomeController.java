package com.ejemplo.autenticacion.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage() {
        return "home";
    }

    @GetMapping("/login")
    public String loginPage(Locale locale, Model model) {
        model.addAttribute("idiomaActual", locale.getLanguage());
        return "login";
    }

    @GetMapping("/admin/privado")
    public String adminPage() {
        return "admin";
    }

    @GetMapping("/user/privado")
    public String userPage() {
        return "user";
    }
}
