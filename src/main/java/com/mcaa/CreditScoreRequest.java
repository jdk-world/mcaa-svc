package com.mcaa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreditScoreRequest {
	
    @JsonProperty("Inputs")
    private CreditInputs Inputs;
    
    private int GlobalParameters;

    public CreditInputs getInputs() {
        return Inputs;
    }

    public void setInputs(CreditInputs inputs) {
        this.Inputs = inputs;
    }

    public int getGlobalParameters() {
        return GlobalParameters;
    }

    public void setGlobalParameters(int globalParameters) {
        this.GlobalParameters = globalParameters;
    }
}

