package com.alsomeb.devopsfinal.repository;

import com.alsomeb.devopsfinal.model.Car;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepository {

        private final List<Car> cars = new ArrayList<>();


        public CarRepository() {
            cars.add(new Car("Lada", LocalDate.of(1991, Month.AUGUST, 23)));
            cars.add(new Car("BMW 330", LocalDate.of(2005, Month.SEPTEMBER, 15)));
            cars.add(new Car("Volvo V70", LocalDate.of(2017, Month.JANUARY, 1)));
            cars.add(new Car("Lamborghini Aventador", LocalDate.of(2020, Month.SEPTEMBER, 23)));
        }

        public List<Car> getCars() {
            return cars;
        }


}

