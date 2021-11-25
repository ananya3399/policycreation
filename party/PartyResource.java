package com.example.policycreation.party;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@RestController
public class PartyResource {

    private PartyService partyService;

    @Autowired
    public PartyResource(PartyService thePartyService) {
        partyService = thePartyService;
    }

    @GetMapping("/party") //to get all the parties
    public List<Party> findAll(){
        return partyService.findAll();
    }

    @GetMapping("/party/{partyid}") //to get a particular party
    public Party getParty(@PathVariable("partyid") int partyId){
        Party theParty = partyService.findById(partyId);
        if(theParty==null){
            throw new RuntimeException("Party id not found - "+partyId);
        }
        return theParty;
    }

    @PostMapping("/party") //to add a party
    public Party addParty(@Valid @RequestBody Party theParty){
        theParty.setPartyid(0);
        partyService.save(theParty);
        return theParty;
    }

    @PutMapping("/party") //to update a party
    public Party updateParty(@RequestBody Party theParty){
        partyService.save(theParty);
        return theParty;
    }

    @DeleteMapping("/party/{partyid}") //to delete a property
    public String deleteParty(@PathVariable("partyid") int partyId){
        Party theParty = partyService.findById(partyId);
        if (theParty==null){
            throw new RuntimeException("Party not found - "+partyId);
        }
        partyService.deleteById(partyId);
        return "Deleted property ID - "+partyId;
    }
}
