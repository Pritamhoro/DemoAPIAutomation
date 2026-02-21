package com.swiftbank.controller;

import com.swiftbank.baseservice.BaseClass;
import io.restassured.response.Response;

public class Authentication extends BaseClass {
    public static final String BASE_PATH="api/auth";
    public  Response login(Object payload)
    {
       return  POST(payload,BASE_PATH+"/login");
    }
}
