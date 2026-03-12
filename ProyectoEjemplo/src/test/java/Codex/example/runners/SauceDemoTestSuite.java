package Codex.example.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.annotations.ClearCookiesPolicy.BeforeEachTest;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/SauceDemo",
        glue = {"Codex.example.stepdefinitions"},
        tags = "@CompraSauceDemo"
)
public class SauceDemoTestSuite {

    @Managed(uniqueSession = true, clearCookies = BeforeEachTest)
    WebDriver driver;
}