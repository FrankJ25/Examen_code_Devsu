package Codex.example.tasks.OpenCart;

import Codex.example.userinterfaces.OpenCart.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FinalizarCompraOpenCart implements Task {

    public static FinalizarCompraOpenCart confirmar() {
        return Tasks.instrumented(FinalizarCompraOpenCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CheckoutPage.CONFIRM_ORDER, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(CheckoutPage.CONFIRM_ORDER)
        );
    }
}