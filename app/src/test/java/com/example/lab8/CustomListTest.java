package com.example.lab8;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list; /**
     * create a mocklist for my citylist * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>()); return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    /**
     * create a mocklist for my citylist
     * add a city to the list
     * check if the city is in the list */
    @Test
    public void hasCityTest(){
        list = MockCityList();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        Assertions.assertTrue(list.hasCity(city));
    }

    /**
     * create a mocklist for my citylist
     * add a city to the list
     * check if the city is in the list
     * remove the city from the list
     * check if the city is not in the list */
    @Test
    public void removeCityTest(){
        list = MockCityList();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        Assertions.assertTrue(list.hasCity(city));
        list.removeCity(city);
        Assertions.assertFalse(list.hasCity(city));
    }

/**
     * create a mocklist for my citylist
     * check if the list is empty
     * add a city to the list
     * check if the list has 1 city */
    @Test
    public void countCitiesTest(){
        list = MockCityList();
        assertEquals(0, list.countCities());
        list.addCity(new City("Estevan", "SK"));
        assertEquals(1, list.countCities());
    }


}
