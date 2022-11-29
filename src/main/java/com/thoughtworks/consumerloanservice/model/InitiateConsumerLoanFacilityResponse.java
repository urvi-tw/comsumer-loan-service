package com.thoughtworks.consumerloanservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class InitiateConsumerLoanFacilityResponse {

    private String productInstanceReference;
    private String stagedRepaymentStatement;
    private String customerCommentary;
    private String loanOutstandingBalance;
    private String dateType;

}
