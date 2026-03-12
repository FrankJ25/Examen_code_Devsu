package Codex.example.tasks.OpenCart;

import Codex.example.userinterfaces.OpenCart.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CompletarDatosFacturacionOpenCart implements Task {

    private final String nombre;
    private final String apellido;
    private final String email;
    private final String telefono;
    private final String direccion;
    private final String ciudad;
    private final String codigoPostal;
    private final String pais;
    private final String region;

    public CompletarDatosFacturacionOpenCart(String nombre, String apellido, String email, String telefono,
                                             String direccion, String ciudad, String codigoPostal,
                                             String pais, String region) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
        this.region = region;
    }

    public static Performable con(String nombre, String apellido, String email, String telefono,
                                  String direccion, String ciudad, String codigoPostal,
                                  String pais, String region) {
        return Tasks.instrumented(
                CompletarDatosFacturacionOpenCart.class,
                nombre, apellido, email, telefono, direccion, ciudad, codigoPostal, pais, region
        );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CheckoutPage.FIRST_NAME, isVisible()).forNoMoreThan(30).seconds(),

                Enter.theValue(nombre).into(CheckoutPage.FIRST_NAME),
                Enter.theValue(apellido).into(CheckoutPage.LAST_NAME),
                Enter.theValue(email).into(CheckoutPage.EMAIL),
                Enter.theValue(telefono).into(CheckoutPage.TELEPHONE),
                Enter.theValue(direccion).into(CheckoutPage.ADDRESS_1),
                Enter.theValue(ciudad).into(CheckoutPage.CITY),
                Enter.theValue(codigoPostal).into(CheckoutPage.POSTCODE),

                SelectFromOptions.byVisibleText(pais).from(CheckoutPage.COUNTRY),
                SelectFromOptions.byVisibleText(region).from(CheckoutPage.REGION),

                Click.on(CheckoutPage.CONTINUE_GUEST_BUTTON),
                WaitUntil.the(CheckoutPage.CONTINUE_SHIPPING_METHOD, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(CheckoutPage.CONTINUE_SHIPPING_METHOD),

                WaitUntil.the(CheckoutPage.TERMS_AND_CONDITIONS, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(CheckoutPage.TERMS_AND_CONDITIONS),
                Click.on(CheckoutPage.CONTINUE_PAYMENT_METHOD)
        );
    }
}