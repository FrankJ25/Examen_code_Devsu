package Codex.example.api.runners;

import com.intuit.karate.junit5.Karate;

public class PetstoreApiRunner {

    @Karate.Test
    Karate testPetstore() {
        return Karate.run("classpath:api/petstore");
    }
}