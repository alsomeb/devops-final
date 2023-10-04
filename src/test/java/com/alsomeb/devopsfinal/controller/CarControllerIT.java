package com.alsomeb.devopsfinal.controller;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;
import java.time.Month;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@Tag("integrationTest")
public class CarControllerIT {

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void testThatFetchAllCarsWorks200() throws Exception {
        String url = "/api/cars";
        mockMvc.perform(get(url))
                .andDo(print())
                .andExpect(status().is(HttpStatus.OK.value()));
    }

    @Test
    public void testThatFetchAllCarsReturnsArrayListOfCars() throws Exception {
        String url = "/api/cars";
        mockMvc.perform(get(url))
                .andDo(print())
                .andExpect(status().is(HttpStatus.OK.value()))
                .andExpect(jsonPath("$", hasSize(4)))
                .andExpect(jsonPath("$[0].model").value("Lada"))
                .andExpect(jsonPath("$[0].yearMade").value(LocalDate.of(1991, Month.AUGUST, 23).toString()));
    }
}
