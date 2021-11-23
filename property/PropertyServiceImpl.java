package com.example.policycreation.property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PropertyServiceImpl implements PropertyService{

    @Autowired
    private PropertyRepository propertyRepository;

    @Autowired
    public PropertyServiceImpl(PropertyRepository thePropertyRepository){
        propertyRepository=thePropertyRepository;
    }

    @Override
    public List<Property> findAll() {
        return propertyRepository.findAll();
    }

    @Override
    public Property findById(int theId) {
        Optional<Property> result=propertyRepository.findById(theId);
        Property theProperty = null;
        if (result.isPresent()){
            theProperty=result.get();
        }
        else {
            throw new RuntimeException("Did not find property ID - "+theId);
        }
        return theProperty;
    }

    @Override
    public void save(Property theProperty) {
        propertyRepository.save(theProperty);
    }

    @Override
    public void deleteById(int theId) {
        propertyRepository.deleteById(theId);
    }
}
