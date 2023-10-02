package com.alsomeb.devopsfinal.unit;

import com.alsomeb.devopsfinal.model.Car;
import com.alsomeb.devopsfinal.repository.CarRepository;
import com.alsomeb.devopsfinal.service.CarServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CarServiceTest {

    @Mock
    private CarRepository carRepository;

    @InjectMocks
    private CarServiceImpl carServiceImpl;

    @Test
    public void fetchAllCarsShouldReturnCorrectList(){
        //Given
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Lada", LocalDate.of(1991, Month.AUGUST, 23)));
        cars.add(new Car("BMW 330", LocalDate.of(2005, Month.SEPTEMBER, 15)));

        //When
        when(carRepository.getCars()).thenReturn(cars);

        List<Car> result = carServiceImpl.fetchAllCars();

        //Then
        assertThat(result)
                .isEqualTo(cars)
                .hasSize(2);
    }
}
