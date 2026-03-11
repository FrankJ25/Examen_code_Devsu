package Yambal.example.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckOutPage {
    public static final Target BOTTON_CHECK = Target.the("boton check out").located(By.xpath("//*[@id='initialStep4']"));
    public static final Target BOTTON_CONTINUE = Target.the("boton check out").located(By.xpath("/html/body/app-root/yanbal-storefront/div/div[2]/main/cx-page-layout/cx-page-slot[2]/yanbal-cart-totals/yanbal-order-summary/section/yanbal-checkout-order-summary/section/yanbal-cart-proceed-to-checkout/yanbal-progress-button/button"));
    public static final Target BOTTON_BUY = Target.the("boton check out").located(By.xpath("/html/body/app-root/yanbal-storefront/div/div[2]/main/cx-page-layout/cx-page-slot[3]/yanbal-checkout-order-summary/section/yanbal-checkout-continue-button/yanbal-progress-button/button"));


}
