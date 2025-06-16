package dev.orangehrm.tests;

import dev.orangehrm.api.POJO.login.LoginRequest;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;


public class ApiTest {
    @Test
    public void loginTest(){
        LoginRequest loginRequest = new LoginRequest("Admin", "admin123");
        given()
                .body(loginRequest).
        when()
                .post("https://opensource-demo.orangehrmlive.com/web/index.php/auth/validate").
        then()
                .log().all()
                .statusCode(200);


    }
}
