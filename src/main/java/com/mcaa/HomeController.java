package com.mcaa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping({"/dashboard", "/"})
    public String getDashboard(Model model) {
        // Add data to the model if needed (e.g., credit score, loans, etc.)
        model.addAttribute("creditScore", 750);
        model.addAttribute("loanAmount", "₹500,000");
        User user = userService.getSampleUsers().get(0);
        //MSME msme = user.getMsme(); // Assuming User has a method to get MSME details

        // Add user and MSME details to the model
        model.addAttribute("user", user);
        //model.addAttribute("msme", msme);
        return "dashboard.html"; // This will look for dashboard.html in src/main/resources/templates
    }
    

    @GetMapping("/credit-assessment")
    public String creditAssessment(Model model) {
        // Add data to the model if needed (e.g., credit score, loans, etc.)
        model.addAttribute("creditScore", 750);
        model.addAttribute("loanAmount", "₹500,000");
        return "credit-assessment.html"; // This will look for dashboard.html in src/main/resources/templates
    }
    
    @GetMapping("/apply-loan")
    public String applyLoan(Model model) {
        // Add data to the model if needed (e.g., credit score, loans, etc.)
        model.addAttribute("creditScore", 750);
        model.addAttribute("loanAmount", "₹500,000");
        return "apply-loan.html"; // This will look for dashboard.html in src/main/resources/templates
    }

    @GetMapping("/financial-tools")
    public String financialTools(Model model) {
        // Add data to the model if needed (e.g., credit score, loans, etc.)
        model.addAttribute("creditScore", 750);
        model.addAttribute("loanAmount", "₹500,000");
        return "financial-tools.html"; // This will look for dashboard.html in src/main/resources/templates
    }
    
    @GetMapping("/profile")
    public String profile(Model model) {
        // Add data to the model if needed (e.g., credit score, loans, etc.)
        model.addAttribute("creditScore", 750);
        model.addAttribute("loanAmount", "₹500,000");
        User user = userService.getSampleUsers().get(0);
        model.addAttribute("user", user);


        return "profile.html"; // This will look for dashboard.html in src/main/resources/templates
    }
    
    @GetMapping("/logout")
    public String logout(Model model) {
        // Add data to the model if needed (e.g., credit score, loans, etc.)
       
        User user = userService.getSampleUsers().get(0);
        model.addAttribute("user", user);


        return "logout.html"; // This will look for dashboard.html in src/main/resources/templates
    }
    
    
    
}
