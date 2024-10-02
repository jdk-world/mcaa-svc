package com.mcaa;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoanOfferController {

	@GetMapping("/loan-offers")
	public String getLoanOffers(Model model) {
	    List<LoanOffer> loanOffers = Arrays.asList(
	        new LoanOffer(1, "Bank A", 7.5, 36, 500000, "Min. 700 Credit Score", "Business Loan"),
	        new LoanOffer(2, "Bank B", 8.1, 24, 300000, "Min. 650 Credit Score", "Term Loan"),
	        new LoanOffer(3, "Bank C", 6.9, 48, 750000, "Min. 720 Credit Score", "Working Capital"),
	        new LoanOffer(4, "Bank D", 7.0, 60, 1000000, "Min. 680 Credit Score", "Personal Loan"),
	        new LoanOffer(5, "Bank E", 9.5, 12, 150000, "Min. 640 Credit Score", "Short-term Loan"),
	        new LoanOffer(6, "Bank F", 8.3, 30, 800000, "Min. 700 Credit Score", "Home Loan"),
	        new LoanOffer(7, "Bank G", 6.5, 36, 200000, "Min. 720 Credit Score", "Education Loan"),
	        new LoanOffer(8, "Bank H", 8.8, 24, 350000, "Min. 660 Credit Score", "Equipment Financing"),
	        new LoanOffer(9, "Bank I", 7.2, 48, 600000, "Min. 700 Credit Score", "Auto Loan"),
	        new LoanOffer(10, "Bank J", 9.0, 12, 250000, "Min. 680 Credit Score", "Debt Consolidation Loan")
	    );
	    model.addAttribute("loanOffers", loanOffers);
	    return "loan-offers.html";
	}

}
