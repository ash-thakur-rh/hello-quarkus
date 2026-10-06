package org.ashish.resource;

import org.ashish.dto.PersonDTO;
import org.ashish.service.PersonService;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class PersonResourceTest {

    @Test
    public void testGetPersonByNameSuccess() {
        given()
            .when().get("/api/persons/John")
            .then()
            .statusCode(200)
            .body("name", is("John"));
    }

    @Test
    public void testGetPersonByNameNotFound() {
        given()
            .when().get("/api/persons/Jane")
            .then()
            .statusCode(404);
    }
}
