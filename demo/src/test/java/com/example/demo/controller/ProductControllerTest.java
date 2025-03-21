package com.example.demo.controller;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

class ProductControllerTest {

    private final String BASE_URL = "http://localhost:8080/products";

    @Test
    void testCreateProduct() {
        // Define request payload
        String requestBody = """
        {
            "name": "Legion",
            "price": 2000.00
        }
        """;

        // Send POST request and validate response
        given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post(BASE_URL)
                .then()
                .statusCode(201) // Expecting HTTP 201 Created
                .body("id", notNullValue()) // ID should be generated
                .body("name", equalTo("Legion")) // Name should match
                .body("price", equalTo(2000.0f)); // Price should match
    }
}
