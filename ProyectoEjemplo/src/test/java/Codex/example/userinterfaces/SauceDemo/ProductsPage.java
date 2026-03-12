package Codex.example.userinterfaces.SauceDemo;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductsPage {

    public static final Target ADD_TO_CART_BUTTON = Target.the("boton agregar producto {0}")
            .locatedBy("//div[text()='{0}']/ancestor::div[@class='inventory_item']//button");

    public static final Target CART_BUTTON = Target.the("icono carrito")
            .located(By.className("shopping_cart_link"));
}