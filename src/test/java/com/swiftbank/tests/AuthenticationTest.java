package com.swiftbank.tests;

import com.swiftbank.controller.Authentication;
import com.swiftbank.models.RequestModels;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class AuthenticationTest {
        Authentication auth=new Authentication();
        RequestModels requestModels=new RequestModels.Builder()
                .setUsername("Admin")
                .setPassword("Admin@1234")
                .build();

        @Test(description = "Verify user should be allowed to the system with working credential")
        public void test() {
            Response response = auth.login(requestModels);
            response.then()
                    .statusCode(200)
                    .log()
                    .body();
        }

}
