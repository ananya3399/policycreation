package com.example.policycreation.party;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartyServiceImpl implements PartyService{

    @Autowired
    private PartyRepository partyRepository;

    @Autowired
    public PartyServiceImpl(PartyRepository thePartyRepository) {
        partyRepository = thePartyRepository;
    }

    @Override
    public List<Party> findAll() {
        return partyRepository.findAll();
    }

    @Override
    public Party findById(int theId) {
        Optional<Party> result=partyRepository.findById(theId);
        Party theParty = null;
        if (result.isPresent()){
            theParty=result.get();
        }
        else {
            throw new RuntimeException("Did not find party ID - "+theId);
        }
        return theParty;
    }

    @Override
    public void save(Party theParty) {
        partyRepository.save(theParty);
    }

    @Override
    public void deleteById(int theId) {
        partyRepository.deleteById(theId);
    }
}
