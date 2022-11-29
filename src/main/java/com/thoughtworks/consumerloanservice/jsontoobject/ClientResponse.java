package com.thoughtworks.consumerloanservice.jsontoobject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
@JsonIgnoreProperties(ignoreUnknown = true)

public class ClientResponse {


    public String encodedKey;
    public String id;
    public String state;
    public String creationDate;
    public String lastModifiedDate;
    public String activationDate;
    public String  approvedDate;
    public String  firstName;
    public String lastName;
    public String preferredLanguage;
    public String clientRoleKey;
    public String loanCycle;
    public String groupLoanCycle;

    @Override
    public String toString() {
        return "ClientResponse{" +
                "encodedKey='" + encodedKey + '\'' +
                ", id='" + id + '\'' +
                ", state='" + state + '\'' +
                ", creationDate='" + creationDate + '\'' +
                ", lastModifiedDate='" + lastModifiedDate + '\'' +
                ", activationDate='" + activationDate + '\'' +
                ", approvedDate='" + approvedDate + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", preferredLanguage='" + preferredLanguage + '\'' +
                ", clientRoleKey='" + clientRoleKey + '\'' +
                ", loanCycle='" + loanCycle + '\'' +
                ", groupLoanCycle='" + groupLoanCycle + '\'' +
                '}';
    }
}
