package com.mcaa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/dashboard")
    public String showDashboard(Model model) {
        // Add data to the model if needed (e.g., credit score, loans, etc.)
        model.addAttribute("creditScore", 750);
        model.addAttribute("loanAmount", "₹500,000");
        return "dashboard.html"; // This will look for dashboard.html in src/main/resources/templates
    }
}
