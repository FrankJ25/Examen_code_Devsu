package Codex.example.userinterfaces.SauceDemo;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage {

    public static final Target TITLE_CART = Target.the("titulo your cart").located(By.xpath("//span[text()='Your Cart']"));

    public static final Target PRODUCT_IN_CART = Target.the("producto en carrito {0}").located(By.xpath("//div[@class='cart_item']//div[@class='inventory_item_name' and text()='{0}']"));

    public static final Target CHECKOUT_BUTTON = Target.the("boton checkout").located(By.id("checkout"));
}