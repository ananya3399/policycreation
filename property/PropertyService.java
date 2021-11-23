package com.example.policycreation.property;

import java.util.List;

public interface PropertyService {
    public List<Property> findAll();
    public Property findById(int theId);
    public void save(Property theProperty);
    public void deleteById(int theId);
}
