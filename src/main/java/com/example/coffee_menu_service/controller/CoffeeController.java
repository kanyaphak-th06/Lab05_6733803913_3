package com.example.coffee_menu_service.controller;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.coffee_menu_service.model.Coffee;
import com.example.coffee_menu_service.service.CoffeeService;



@RestController
@RequestMapping("/coffees")
public class CoffeeController {



    private final CoffeeService coffeeService;



    public CoffeeController(CoffeeService coffeeService) {

        this.coffeeService = coffeeService;

    }




    // GET /coffees
    @GetMapping
    public List<Coffee> getAllCoffees() {

        return coffeeService.getAllCoffees();

    }




    // GET /coffees/{id}
    @GetMapping("/{id}")
    public ResponseEntity<Coffee> getCoffeeById(
            @PathVariable int id
    ) {


        return coffeeService.getCoffeeById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());

    }




    // POST /coffees
    @PostMapping
    public ResponseEntity<Coffee> createCoffee(
            @RequestBody Coffee coffee
    ) {


        Coffee newCoffee = coffeeService.createCoffee(coffee);


        return ResponseEntity.ok(newCoffee);

    }





    // PUT /coffees/{id}
    @PutMapping("/{id}")
    public ResponseEntity<Coffee> updateCoffee(
            @PathVariable int id,
            @RequestBody Coffee coffee
    ) {


        return coffeeService.updateCoffee(id, coffee)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());

    }





    // DELETE /coffees/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCoffee(
            @PathVariable int id
    ) {


        if (coffeeService.deleteCoffee(id)) {

            return ResponseEntity.ok().build();

        }


        return ResponseEntity.notFound().build();

    }


}