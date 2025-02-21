package com.example.controller;

import com.example.model.CostingRequest;
import com.example.service.CostingService;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class CostingController {

    private final CostingService costingService;

    public CostingController(CostingService costingService) {
        this.costingService = costingService;
    }

    @GetMapping("/")
    public String showCalculatorForm(Model model) {
        model.addAttribute("costingRequest", new CostingRequest());
        return "calculator";
    }

    @PostMapping("/calculate")
    public String calculate(@ModelAttribute CostingRequest request, Model model) {
        double[] results = costingService.calculateCost(request);
        
        model.addAttribute("c17", results[0]);
        model.addAttribute("c20", results[1]);
        model.addAttribute("c21", results[2]);
        model.addAttribute("c22", results[3]);
        model.addAttribute("c23", results[4]);
        model.addAttribute("c24", results[5]);
        
        return "calculator";
    }
}
