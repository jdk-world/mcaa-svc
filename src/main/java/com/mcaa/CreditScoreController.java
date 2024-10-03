package com.mcaa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CreditScoreController {

    private final CreditScoreService scoreService;

    @Autowired
    public CreditScoreController(CreditScoreService scoreService) {
        this.scoreService = scoreService;
    }

    // Endpoint to trigger the score prediction
    @PostMapping("/predict-score")
    public ResponseEntity<String> predictScore(@RequestBody CreditScoreRequest scoreRequest) {
        try {
            // Call the service to invoke the /score endpoint
            String response = scoreService.callScoreEndpoint(scoreRequest);

            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed to predict score: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
