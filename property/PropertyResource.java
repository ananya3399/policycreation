package com.example.policycreation.property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PropertyResource {

    private PropertyService propertyService;

    @Autowired
    public PropertyResource(PropertyService thePropertyService){
        propertyService=thePropertyService;
    }

    @GetMapping("/property") //to get all the properties
    public List<Property> findAll(){
        return propertyService.findAll();
    }

    @GetMapping("/property/{propertyid}") //to get a particular property
    public Property getProperty(@PathVariable("propertyid") int propertyId){
        Property theProperty = propertyService.findById(propertyId);
        if(theProperty==null){
            throw new RuntimeException("Property id not found - "+propertyId);
        }
        return theProperty;
    }

    @PostMapping("/property") //to add a property
    public Property addProperty(@RequestBody Property theProperty){
        theProperty.setPropertyid(0);
        propertyService.save(theProperty);
        return theProperty;
    }

    @PutMapping("/property") //to update a property
    public Property updateProperty(@RequestBody Property theProperty){
        propertyService.save(theProperty);
        return theProperty;
    }

    @DeleteMapping("/property/{propertyid}") //to delete a property
    public String deleteProperty(@PathVariable("propertyid") int propertyId){
        Property theProperty = propertyService.findById(propertyId);
        if (theProperty==null){
            throw new RuntimeException("Property not found - "+propertyId);
        }
        propertyService.deleteById(propertyId);
        return "Deleted property ID - "+propertyId;
    }
}
