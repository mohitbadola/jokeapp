package mohit.spring.jokes.controllers;

import mohit.spring.jokes.services.jokeservice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class jokecontroller {

    private final jokeservice jokeservice;

    public jokecontroller(jokeservice jokeservice) {this.jokeservice = jokeservice;}
@RequestMapping({"/",""})
    public String showJoke(Model model){

        model.addAttribute("joke", jokeservice.getJoke());
        return "index";
    }
}
