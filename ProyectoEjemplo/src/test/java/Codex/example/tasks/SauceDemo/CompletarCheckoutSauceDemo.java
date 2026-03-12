package Codex.example.tasks.SauceDemo;

import Codex.example.userinterfaces.SauceDemo.CartPage;
import Codex.example.userinterfaces.SauceDemo.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CompletarCheckoutSauceDemo implements Task {

    private String nombre;
    private String apellido;
    private String codigoPostal;

    public CompletarCheckoutSauceDemo(String nombre, String apellido, String codigoPostal){
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoPostal = codigoPostal;
    }

    public static Performable con(String nombre, String apellido, String codigoPostal){
        return Tasks.instrumented(CompletarCheckoutSauceDemo.class, nombre, apellido, codigoPostal);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(CartPage.CHECKOUT_BUTTON),

                Enter.theValue(nombre).into(CheckoutPage.FIRST_NAME),
                Enter.theValue(apellido).into(CheckoutPage.LAST_NAME),
                Enter.theValue(codigoPostal).into(CheckoutPage.POSTAL_CODE),

                Click.on(CheckoutPage.CONTINUE_BUTTON)
        );
    }
}