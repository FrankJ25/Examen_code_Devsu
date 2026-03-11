package Yambal.example.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductoPage {
    public static final Target NRO_PRODUCTO = Target.the("campo nro de productos").located(By.xpath("/html/body/app-root/yanbal-storefront/div/div[2]/main/cx-page-layout/cx-page-slot[1]/yanbal-add-to-cart/form/div[1]/div/yanbal-item-counter/input"));
    public static final Target BOTTON_AGREGAR_BOLSA = Target.the("campo nro de productos").located(By.xpath("/html/body/app-root/yanbal-storefront/div/div[2]/main/cx-page-layout/cx-page-slot[1]/yanbal-add-to-cart/form/div[2]/button"));



}
