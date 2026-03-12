package Codex.example.userinterfaces.OpenCart;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SuccessPage {

    public static final Target SUCCESS_MESSAGE = Target.the("mensaje de confirmacion")
            .located(By.xpath("//div[@id='content']//h1"));
}