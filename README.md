# MSME Credit Access Advisor (MCAA)

## Overview
The MSME Credit Access Advisor (MCAA) is a GenAI-powered platform designed to revolutionize credit access for underserved micro, small, and medium enterprises (MSMEs). By utilizing AI, cash flow-based lending models, and Open Credit Enablement Network (OCEN) integration, MCAA facilitates seamless connectivity between MSMEs and diverse financing options from lenders, investors, and government programs. The platform empowers MSMEs by providing tools to optimize financial management and enhance their creditworthiness, thereby promoting financial literacy and contributing to financial inclusion in underserved markets.

The solution enables efficient credit assessment and streamlined data exchange for MSMEs looking to access short-tenor, small-ticket loans, crucial for sustaining micro-enterprises.

## Key Features
- **Automated Credit Scoring**: Uses alternative data (e.g., cash flow patterns, transaction history) to assess creditworthiness.
- **Faster Loan Processing**: Automates credit assessment and eligibility checks, enabling quicker, more efficient loan approvals.
- **GenAI-Powered Insights**: Leverages AI to predict and simulate the effects of changing market conditions, providing lenders and MSMEs with better financial insights.
- **OCEN Integration**: Connects with OCEN APIs to fetch relevant lender offers, improving the overall ecosystem for MSME financing.

## Solution Steps

### Step 1: Create Synthetic Datasets to Mimic OCEN API Calls
Synthetic datasets were generated to represent key data that would typically be returned from OCEN API calls. These datasets include:

- **Lender Offers**: Data related to offers from different financial institutions, including loan amounts, interest rates, and eligibility criteria.
- **Loan Application Details**: Information about the loan applications submitted by MSMEs.
- **MSME Financial Data**: Financial records of MSMEs, including revenue, expenses, and cash flow data.

### Step 2: Join Datasets in Azure Machine Learning Studio
The synthetic datasets are joined in Azure Machine Learning Studio using a data preparation pipeline to form a consolidated view of MSME credit profiles, loan applications, and lender offers.

### Step 3: Create Data Preparation Pipeline
An automated pipeline is created to prepare the datasets for training. This pipeline cleans and combines MSME financial data with loan application details and lender offers, preparing the data for the model training phase.

### Step 4: Create an Automated ML Pipeline to Train the Model
An Automated Machine Learning (AutoML) pipeline is set up in Azure Machine Learning Studio to train the model. The pipeline uses the prepared dataset to train a machine learning model capable of predicting MSME credit scores. The model uses key variables such as revenue, cash flow, loan amounts, and lender-specific criteria to produce a reliable credit score.

### Step 5: Expose the Model Using a Web Service Endpoint
The trained model is deployed as a web service endpoint in Azure. This `/predict-score` endpoint is exposed via Azure API Management to allow external applications, lenders, and other stakeholders to interact with the platform.

### Step 6: Use the `/predict-score` Endpoint to Provide Credit Scores
The exposed `/predict-score` API endpoint provides credit scores for MSMEs based on payload requests submitted by external systems. By integrating this service, lenders can request a credit score by providing MSME financial data, which is assessed in real-time.

## Synthetic Datasets
The following synthetic datasets were created for model training and are available publicly in Azure Blob Storage:

- **[Lender Offers Dataset](https://mlwrkspace0588948531.blob.core.windows.net/azureml-blobstore-e116aaf3-01f1-4910-8310-213c06e0e330/UI/2024-10-03_025604_UTC/lender_offers.csv)**
  - Fields include: `lender_id`, `offer_id`, `loan_amount`, `interest_rate`, `eligibility_criteria`, etc.

- **[Loan Application Details Dataset](https://mlwrkspace0588948531.blob.core.windows.net/azureml-blobstore-e116aaf3-01f1-4910-8310-213c06e0e330/UI/2024-10-03_025526_UTC/loan_application_details.csv)**
  - Fields include: `application_id`, `msme_id`, `loan_amount_requested`, `repayment_period`, `purpose`, etc.

- **[MSME Financial Data Dataset](https://mlwrkspace0588948531.blob.core.windows.net/azureml-blobstore-e116aaf3-01f1-4910-8310-213c06e0e330/UI/2024-10-03_025432_UTC/msme_financial_data.csv)**
  - Fields include: `msme_id`, `revenue`, `expenses`, `cash_flow`, `profit_margin`, etc.

## Score Endpoint
The `/predict-score` endpoint is available for predicting credit scores using a POST call.

### Endpoint URL
POST https://mcaa.azurewebsites.net/api/predict-score

### Payload Example
```json
{
  "Inputs": {
    "data": [
      {
        "msme_id": "MSME12345",
        "lender_name": "Bank A",
        "interest_rate": 5.5,
        "loan_amount_offered": 100000,
        "repayment_period": 12,
        "eligibility": "Eligible",
        "loan_amount_requested": 150000,
        "loan_tenure": 12,
        "loan_purpose": "Business Expansion",
        "msme_id_R": "MSME54321",
        "business_name": "ABC Industries",
        "annual_revenue": 500000,
        "cash_flow": 20000,
        "gst_returns": 5000,
        "loan_history": 3
      }
    ]
  },
  "GlobalParameters": 1
}
