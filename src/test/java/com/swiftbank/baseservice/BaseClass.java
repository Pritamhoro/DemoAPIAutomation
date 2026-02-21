package com.swiftbank.baseservice;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class BaseClass {
    private static final String BASE_URI = "http://64.227.160.186:8080";
    private static RequestSpecification requestSpecification;
    public BaseClass (){
        requestSpecification= given()
                .baseUri(BASE_URI)
                .contentType(ContentType.JSON);
    }
    public Response POST(Object payload, String endpoint) {
        return requestSpecification.when().body(payload).post(endpoint);
    }
}