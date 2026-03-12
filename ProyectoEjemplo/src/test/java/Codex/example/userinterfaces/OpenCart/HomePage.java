package Codex.example.userinterfaces.OpenCart;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target PRODUCTO = Target.the("producto {0}")
            .locatedBy("//a[text()='{0}']");

    public static final Target ADD_TO_CART = Target.the("boton add to cart de {0}")
            .locatedBy("//a[text()='{0}']/ancestor::div[contains(@class,'product-thumb')]//button[contains(@onclick,'cart.add')]");

    public static final Target CART_TOTAL = Target.the("boton carrito superior")
            .located(By.id("cart-total"));

    public static final Target VIEW_CART = Target.the("opcion ver carrito")
            .located(By.xpath("//strong[text()=' View Cart']"));
}