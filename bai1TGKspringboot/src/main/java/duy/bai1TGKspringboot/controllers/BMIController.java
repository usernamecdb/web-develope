package duy.bai1TGKspringboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class BMIController {

    @GetMapping("/bmiform")
    public String bmiForm() {
        return "bmi";
    }

    @PostMapping("/bmicalculator")
    public String bmiSubmit(@RequestParam("weight") double weight, 
                            @RequestParam("height") double height, 
                            Model model) {
        double bmi = weight / Math.pow(height/100.0, 2);
        model.addAttribute("bmi", bmi);
        model.addAttribute("weight", weight);
        model.addAttribute("height", height);
        return "bmi";
    }
}
 	