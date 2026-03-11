package Codex.example.userinterfaces.Demoblaze;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductoPage {

    public static Target producto(String nombreProducto) {
        return Target.the("producto " + nombreProducto)
                .located(By.xpath("//a[contains(@class,'hrefch') and contains(text(),'" + nombreProducto + "')]"));
    }

    public static final Target AGREGAR = Target.the("botón agregar al carrito")
            .located(By.xpath("//a[contains(text(),'Add to cart')]"));

    public static final Target HOME = Target.the("link Home")
            .located(By.xpath("//a[contains(text(),'Home')]"));
}