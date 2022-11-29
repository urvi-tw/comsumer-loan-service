package com.thoughtworks.consumerloanservice.jsontoobject;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class trial {


    public static void main(String[] args) {
        System.out.println("Experimenting with Json ");

        ObjectMapper mapper = new ObjectMapper();
        ClientResponse clientObject = null;
        try {

            clientObject = mapper.readValue(new File("/Users/urvikalia/Documents/plait/cosumer-loan/consumer-loan-service/src/main/java/com/thoughtworks/consumerloanservice/jsontoobject/client.json"),
                    ClientResponse.class);
            System.out.println("printing");
            System.out.println(clientObject.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("To obj");
        System.out.println(clientObject.toString());

    }
}
