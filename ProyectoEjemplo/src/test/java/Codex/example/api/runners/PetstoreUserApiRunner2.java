package Codex.example.api.runners;

import com.intuit.karate.junit5.Karate;

public class PetstoreUserApiRunner2 {

    @Karate.Test
    Karate testUserApi() {
        return Karate.run("classpath:api/petstore-user");
    }
}