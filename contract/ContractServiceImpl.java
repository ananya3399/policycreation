package com.example.policycreation.contract;

import com.example.policycreation.party.Party;
import com.example.policycreation.party.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContractServiceImpl implements ContractService{

    @Autowired
    private PartyRepository partyRepository;

    @Override
    public boolean findById(int theId) {
        boolean flag=false;
        Optional<Party> result=partyRepository.findById(theId);
        if (result.isPresent()){
            flag=true;
        }
        else {
            throw new RuntimeException("Did not find party ID - "+theId);
        }
        return flag;
    }
}
