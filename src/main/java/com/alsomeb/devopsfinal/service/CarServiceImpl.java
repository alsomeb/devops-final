package com.alsomeb.devopsfinal.service;

import com.alsomeb.devopsfinal.model.Car;
import com.alsomeb.devopsfinal.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> fetchAllCars() {
        return carRepository.getCars();
    }
}
