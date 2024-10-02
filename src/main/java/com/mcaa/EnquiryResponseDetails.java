package com.mcaa;

public class EnquiryResponseDetails {
    private Enquiry enquiry;
    private String predictedScore;

    public EnquiryResponseDetails(Enquiry enquiry, String predictedScore) {
        this.enquiry = enquiry;
        this.predictedScore = predictedScore;
    }

    public Enquiry getEnquiry() {
        return enquiry;
    }

    public String getPredictedScore() {
        return predictedScore;
    }
}
