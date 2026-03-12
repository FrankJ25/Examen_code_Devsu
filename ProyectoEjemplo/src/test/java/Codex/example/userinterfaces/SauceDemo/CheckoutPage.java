package Codex.example.userinterfaces.SauceDemo;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutPage {

    public static final Target FIRST_NAME = Target.the("campo first name").located(By.id("first-name"));
    public static final Target LAST_NAME = Target.the("campo last name").located(By.id("last-name"));
    public static final Target POSTAL_CODE = Target.the("campo postal code").located(By.id("postal-code"));
    public static final Target CONTINUE_BUTTON = Target.the("boton continue").located(By.id("continue"));
}