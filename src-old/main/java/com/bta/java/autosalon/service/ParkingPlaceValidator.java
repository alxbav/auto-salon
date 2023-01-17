package com.bta.java.autosalon.service;


import com.bta.java.autosalon.model.place.Place;
import com.bta.java.autosalon.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ParkingPlaceValidator {
    private static final int PLACE_COUNT = 20;


    //@Autowired
    private PlaceRepository placeRepository;

    public boolean hasFreePlace() {

       /* final long occupiedPlaces = placeRepository.count();
        return occupiedPlaces < PLACE_COUNT;*/
        return false;
    }

    public int getFreePlace() {
      /* Set<Integer> ocupiedPlaces = placeRepository.findAll()
               .stream()
               .map(Place::getNumber)
               .collect(Collectors.toSet());

       Set<Integer> possiblePlaces = Stream.iterate(0,(prev->prev+1))
               .limit(PLACE_COUNT)
               .collect(Collectors.toSet());


       possiblePlaces.removeAll(ocupiedPlaces);
       return possiblePlaces.stream()
               .findFirst()
               .get();*/
        return 0;
    }
}
