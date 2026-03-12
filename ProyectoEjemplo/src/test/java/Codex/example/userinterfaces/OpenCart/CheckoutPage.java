package Codex.example.userinterfaces.OpenCart;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutPage {

    public static final Target GUEST_CHECKOUT_RADIO = Target.the("opcion guest checkout")
            .located(By.xpath("//input[@value='guest']"));

    public static final Target CONTINUE_ACCOUNT_BUTTON = Target.the("continuar account")
            .located(By.id("button-account"));

    public static final Target FIRST_NAME = Target.the("campo first name")
            .located(By.id("input-payment-firstname"));

    public static final Target LAST_NAME = Target.the("campo last name")
            .located(By.id("input-payment-lastname"));

    public static final Target EMAIL = Target.the("campo email")
            .located(By.id("input-payment-email"));

    public static final Target TELEPHONE = Target.the("campo telephone")
            .located(By.id("input-payment-telephone"));

    public static final Target ADDRESS_1 = Target.the("campo address 1")
            .located(By.id("input-payment-address-1"));

    public static final Target CITY = Target.the("campo city")
            .located(By.id("input-payment-city"));

    public static final Target POSTCODE = Target.the("campo postcode")
            .located(By.id("input-payment-postcode"));

    public static final Target COUNTRY = Target.the("combo country")
            .located(By.id("input-payment-country"));

    public static final Target REGION = Target.the("combo region")
            .located(By.id("input-payment-zone"));

    public static final Target CONTINUE_GUEST_BUTTON = Target.the("continuar guest")
            .located(By.id("button-guest"));

    public static final Target CONTINUE_SHIPPING_METHOD = Target.the("continuar shipping method")
            .located(By.id("button-shipping-method"));

    public static final Target TERMS_AND_CONDITIONS = Target.the("check terms and conditions")
            .located(By.name("agree"));

    public static final Target CONTINUE_PAYMENT_METHOD = Target.the("continuar payment method")
            .located(By.id("button-payment-method"));

    public static final Target CONFIRM_ORDER = Target.the("boton confirm order")
            .located(By.id("button-confirm"));
}