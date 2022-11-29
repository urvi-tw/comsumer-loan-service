package com.thoughtworks.consumerloanservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class InitiateConsumerLoanFacilityRequest {
    private String partyReference; // mapped to clientId of Mambu
    private String loanType; // mapped to productId of Mambu
}
