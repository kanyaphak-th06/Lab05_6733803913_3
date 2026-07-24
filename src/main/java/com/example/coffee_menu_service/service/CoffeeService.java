package com.example.coffee_menu_service.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.coffee_menu_service.model.Coffee;


@Service
public class CoffeeService {


    private final List<Coffee> coffeeList = new ArrayList<>();

    private int idCounter = 0;



    public CoffeeService() {

        createCoffee(new Coffee(0, "Espresso", 45.0));

        createCoffee(new Coffee(0, "Latte", 55.0));

    }



    public List<Coffee> getAllCoffees() {

        return coffeeList;

    }



    public Optional<Coffee> getCoffeeById(int id) {

        return coffeeList.stream()
                .filter(coffee -> coffee.getId() == id)
                .findFirst();

    }



    public Coffee createCoffee(Coffee coffee) {

        idCounter++;

        coffee.setId(idCounter);

        coffeeList.add(coffee);

        return coffee;

    }



    public Optional<Coffee> updateCoffee(int id, Coffee updatedCoffee) {


        return getCoffeeById(id)
                .map(existingCoffee -> {


                    existingCoffee.setName(updatedCoffee.getName());

                    existingCoffee.setPrice(updatedCoffee.getPrice());


                    return existingCoffee;

                });

    }



    public boolean deleteCoffee(int id) {

        return coffeeList.removeIf(
                coffee -> coffee.getId() == id
        );

    }

}