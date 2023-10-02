package com.alsomeb.devopsfinal.controller;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasSize;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CarControllerIT {

    @LocalServerPort
    int serverPort;

    @BeforeEach
     void setUp() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = serverPort;
    }

    @Test
    public void testReceivesOk200AndCarList() {
        given()
                .when()
                .get("api/cars")
                .then()
                .assertThat()
                .statusCode(200)
                .body("", hasSize(4)); // Path "" är jsonPath $, dvs själva listan
    }
}
