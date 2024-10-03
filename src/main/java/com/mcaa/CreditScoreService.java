package com.mcaa;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CreditScoreService {

    private static final String SCORE_URL = "http://2c53d98a-5d84-469e-9d19-63bc998a9782.eastus2.azurecontainer.io/score";

    public String callScoreEndpoint(CreditScoreRequest scoreRequest) {
        
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<CreditScoreRequest> entity = new HttpEntity<>(scoreRequest, headers);

        ResponseEntity<ScoreResponse> response = restTemplate.exchange(SCORE_URL, HttpMethod.POST, entity, ScoreResponse.class);

        // Process the response and return the predicted score
        if (response.getStatusCode() == HttpStatus.OK && response.getBody() != null) {
            System.out.println("Score prediction response: " + response.getBody().getResults().get(0));
            return response.getBody().getResults().get(0);  
        } else {
            throw new RuntimeException("Failed to get score. Status: " + response.getStatusCode());
        }
    }
}
