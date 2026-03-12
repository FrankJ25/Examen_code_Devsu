package Codex.example.api.runners;

import com.intuit.karate.junit5.Karate;

public class DemoApiRunner {

    @Karate.Test
    Karate testApi() {
        return Karate.run("classpath:api/demoblaze");
    }
}