package com.alsomeb.devopsfinal.controller;

import com.alsomeb.devopsfinal.model.Car;
import com.alsomeb.devopsfinal.service.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    ResponseEntity<List<Car>> fetchAllCars() {
        return ResponseEntity.ok(carService.fetchAllCars());
    }
}
