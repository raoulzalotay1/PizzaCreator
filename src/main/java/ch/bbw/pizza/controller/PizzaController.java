package ch.bbw.pizza.controller;

import ch.bbw.pizza.enums.PizzaSize;
import ch.bbw.pizza.enums.PizzaTopping;
import ch.bbw.pizza.model.Pizza;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;

@Controller
public class PizzaController {
    private Pizza createdPizza;

    @GetMapping("/")
    public String myViewDisplay(Model model) {
        var toppings = Arrays.asList(PizzaTopping.values());
        model.addAttribute("selectableToppings", toppings);

        var sizes = Arrays.asList(PizzaSize.values());
        model.addAttribute("sizes", sizes);

        model.addAttribute("pizza", new Pizza());
        return "creator";
    }

    @PostMapping("/")
    public String mySubmitMethod(@ModelAttribute Pizza pizza) {
        pizza.calculatePrice();
        createdPizza = pizza;
        return "endPage";
    }

    @GetMapping("/endPage")
    public String endPage(Model model){
        model.addAttribute(createdPizza);

        return "endPage";
    }
}
