package Codex.example.tasks.OpenCart;

import Codex.example.userinterfaces.OpenCart.CartPage;
import Codex.example.userinterfaces.OpenCart.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IniciarGuestCheckoutOpenCart implements Task {

    public static IniciarGuestCheckoutOpenCart comoInvitado() {
        return Tasks.instrumented(IniciarGuestCheckoutOpenCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CartPage.CHECKOUT_BUTTON, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(CartPage.CHECKOUT_BUTTON),

                WaitUntil.the(CheckoutPage.GUEST_CHECKOUT_RADIO, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(CheckoutPage.GUEST_CHECKOUT_RADIO),

                Click.on(CheckoutPage.CONTINUE_ACCOUNT_BUTTON)
        );
    }
}