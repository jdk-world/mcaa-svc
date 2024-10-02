package com.mcaa;

public class EnquiryResponse {
	private String message;
	private String enquiryDetailsUrl;
	private String predictedScore;


	public EnquiryResponse(String message, String enquiryDetailsUrl, String predictedScore) {
		this.message = message;
		this.enquiryDetailsUrl = enquiryDetailsUrl;
		this.predictedScore = predictedScore;
	}


	public String getPredictedScore() {
		return predictedScore;
	}


	public void setPredictedScore(String predictedScore) {
		this.predictedScore = predictedScore;
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getEnquiryDetailsUrl() {
		return enquiryDetailsUrl;
	}

	public void setEnquiryDetailsUrl(String enquiryDetailsUrl) {
		this.enquiryDetailsUrl = enquiryDetailsUrl;
	}
}
