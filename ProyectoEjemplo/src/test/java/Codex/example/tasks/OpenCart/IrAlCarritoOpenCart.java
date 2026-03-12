package Codex.example.tasks.OpenCart;

import Codex.example.userinterfaces.OpenCart.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IrAlCarritoOpenCart implements Task {

    public static IrAlCarritoOpenCart ir() {
        return Tasks.instrumented(IrAlCarritoOpenCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(HomePage.CART_TOTAL, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(HomePage.CART_TOTAL),

                WaitUntil.the(HomePage.VIEW_CART, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(HomePage.VIEW_CART)
        );
    }
}