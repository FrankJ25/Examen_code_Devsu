package Codex.example.userinterfaces.SauceDemo;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FinishPage {

    public static final Target TITLE_COMPLETE = Target.the("titulo checkout complete").located(By.xpath("//span[text()='Checkout: Complete!']"));
    public static final Target MESSAGE_CONFIRMATION = Target.the("mensaje de confirmacion").located(By.xpath("//h2[@class='complete-header']"));
    public static final Target BACK_HOME_BUTTON = Target.the("boton back home").located(By.id("back-to-products"));
}