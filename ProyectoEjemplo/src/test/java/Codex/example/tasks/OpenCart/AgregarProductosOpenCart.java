package Codex.example.tasks.OpenCart;

import Codex.example.userinterfaces.OpenCart.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarProductosOpenCart implements Task {

    private final String producto1;
    private final String producto2;

    public AgregarProductosOpenCart(String producto1, String producto2) {
        this.producto1 = producto1;
        this.producto2 = producto2;
    }

    public static Performable con(String producto1, String producto2) {
        return Tasks.instrumented(AgregarProductosOpenCart.class, producto1, producto2);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(HomePage.ADD_TO_CART.of(producto1), isVisible()).forNoMoreThan(30).seconds(),
                Click.on(HomePage.ADD_TO_CART.of(producto1)),

                WaitUntil.the(HomePage.ADD_TO_CART.of(producto2), isVisible()).forNoMoreThan(30).seconds(),
                Click.on(HomePage.ADD_TO_CART.of(producto2))
        );
    }
}