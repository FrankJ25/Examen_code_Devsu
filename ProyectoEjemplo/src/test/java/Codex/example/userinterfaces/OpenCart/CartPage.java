package Codex.example.userinterfaces.OpenCart;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage {

    public static final Target CHECKOUT_BUTTON = Target.the("boton checkout")
            .located(By.linkText("Checkout"));
}