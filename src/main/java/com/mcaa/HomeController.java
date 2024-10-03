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
        model.addAttribute("creditScore", 750);
        model.addAttribute("loanAmount", "₹500,000");
        User user = userService.getSampleUsers().get(0);

        // Add user and MSME details to the model
        model.addAttribute("user", user);
        //model.addAttribute("msme", msme);
        return "dashboard.html"; 
    }
    

    @GetMapping("/credit-assessment")
    public String creditAssessment(Model model) {
        model.addAttribute("creditScore", 750);
        model.addAttribute("loanAmount", "₹500,000");
        return "credit-assessment.html"; 
    }
    
    @GetMapping("/apply-loan")
    public String applyLoan(Model model) {
        model.addAttribute("creditScore", 750);
        model.addAttribute("loanAmount", "₹500,000");
        return "apply-loan.html"; 
    }

    @GetMapping("/financial-tools")
    public String financialTools(Model model) {
        model.addAttribute("creditScore", 750);
        model.addAttribute("loanAmount", "₹500,000");
        return "financial-tools.html"; 
    }
    
    @GetMapping("/profile")
    public String profile(Model model) {
        model.addAttribute("creditScore", 750);
        model.addAttribute("loanAmount", "₹500,000");
        User user = userService.getSampleUsers().get(0);
        model.addAttribute("user", user);


        return "profile.html"; 
    }
    
    @GetMapping("/logout")
    public String logout(Model model) {
       
        User user = userService.getSampleUsers().get(0);
        model.addAttribute("user", user);


        return "logout.html"; 
    }
    
    
    
}
