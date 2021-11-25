package com.example.policycreation.contract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContractResource {

    private ContractService contractService;

    @Autowired
    public ContractResource(ContractService thecontractService) {
        contractService = thecontractService;
    }

    @PostMapping("/contract")
    public String calculatePremium(@RequestBody Contract theContract){
        float premium;
        if (contractService.findById(theContract.getPartyid())){
             int a = theContract.getPremiumfactor();
             premium = (float) (a*0.5);
        }
        else {
            throw new RuntimeException("Premium could not be calculated");
        }
        return "The premium calculated is : "+premium;
    }
}
