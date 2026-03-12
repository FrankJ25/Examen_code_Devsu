package Codex.example.userinterfaces.SauceDemo;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OverviewPage {

    public static final Target TITLE_OVERVIEW = Target.the("titulo checkout overview").located(By.xpath("//span[text()='Checkout: Overview']"));
    public static final Target FINISH_BUTTON = Target.the("boton finish").located(By.id("finish"));
}