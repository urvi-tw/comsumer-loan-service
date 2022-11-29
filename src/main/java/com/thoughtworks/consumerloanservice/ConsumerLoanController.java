package com.thoughtworks.consumerloanservice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.thoughtworks.consumerloanservice.model.InitiateConsumerLoanFacilityRequest;
import com.thoughtworks.consumerloanservice.model.InitiateConsumerLoanFacilityResponse;
import com.thoughtworks.consumerloanservice.model.LoanProductResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;


@RestController
@RequestMapping("/consumerloan")
//@Api(value = "Inventory Controller", description = "Inventory APIs")
public class ConsumerLoanController {

    private String invokeExternalService(String inputUrl) throws IOException {
        URL obj = new URL(inputUrl);
        //URL obj = new URL("https://thoughtworkssingapore.sandbox.mambu.com/api/clients/586469954?detailsLevel=BASIC");
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Accept", "application/vnd.mambu.v2+json");
        con.setRequestProperty("apiKey", "PzVJR1LeaDKpb5xTpMc8UcWwvyfj4L3p");
        con.setRequestMethod("GET");
        int responseCode = con.getResponseCode();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        return(response.toString());
    }

    @PostMapping("/initiate")
    public ResponseEntity initiate(InitiateConsumerLoanFacilityRequest input) throws IOException {


        URL obj = new URL("https://thoughtworkssingapore.sandbox.mambu.com/api/loanproducts/INDIAP?detailsLevel=FULL");
        //URL obj = new URL("https://thoughtworkssingapore.sandbox.mambu.com/api/clients/586469954?detailsLevel=BASIC");
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Accept", "application/vnd.mambu.v2+json");
        //con.setDoOutput(true);
        con.setRequestProperty("apiKey", "PzVJR1LeaDKpb5xTpMc8UcWwvyfj4L3p");
        con.setRequestMethod("GET");
        int responseCode = con.getResponseCode();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        System.out.println(response.toString());


        // get it in JSON format
        ObjectMapper mapper = new ObjectMapper();
        LoanProductResponse loanProduct = mapper.readValue(response.toString(),
                LoanProductResponse.class);
        System.out.println("To obj");
        System.out.println(loanProduct.toString());


        //TODO :
        /*1. first invoke create loan account on mambu
          2. then activate the same account
          3. populate the output
            - loan account reference  (return)

        */
        InitiateConsumerLoanFacilityResponse response1 = InitiateConsumerLoanFacilityResponse.builder().productInstanceReference("productId10").stagedRepaymentStatement("repayment").customerCommentary("commentary").loanOutstandingBalance("1000").dateType("10").build();
        return ResponseEntity.ok(response1);
    }


    @GetMapping("/all")
    public ResponseEntity getAllProducts() {
        InitiateConsumerLoanFacilityRequest input = InitiateConsumerLoanFacilityRequest.builder().partyReference("10").loanType("11").build();
        return ResponseEntity.ok(input);
    }

    // Temp work : to fetch loan Product from Mambu
    @GetMapping("/get_loan_product")
    public ResponseEntity getLoanProduct() {
        String response = null;
        String url ="https://thoughtworkssingapore.sandbox.mambu.com/api/loanproducts/INDIAP?detailsLevel=FULL";
        try {
             response =invokeExternalService(url);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }





        ObjectMapper mapper = new ObjectMapper();
        LoanProductResponse loanProduct = null;
        try {
            loanProduct = mapper.readValue(response.toString(),
                    LoanProductResponse.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return ResponseEntity.ok(loanProduct);
    }

}

