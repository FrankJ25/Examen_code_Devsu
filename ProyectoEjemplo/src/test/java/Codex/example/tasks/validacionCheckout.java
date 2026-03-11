package Yambal.example.tasks;

import Yambal.example.userinterfaces.CheckOutPage;
import Yambal.example.userinterfaces.ProductoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class validacionCheckout implements Task {
    // Constructor vacío
    public validacionCheckout() {
    }

    // Factory Method
    public static Performable checkout() {
        return instrumented(validacionCheckout.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                // 1 Esperar input
                WaitUntil.the(CheckOutPage.BOTTON_CHECK, isVisible())
                        .forNoMoreThan(30).seconds(),
                Click.on(CheckOutPage.BOTTON_CHECK),
                WaitUntil.the(CheckOutPage.BOTTON_CONTINUE, isVisible())
                        .forNoMoreThan(30).seconds(),
                Click.on(CheckOutPage.BOTTON_CONTINUE),
                WaitUntil.the(CheckOutPage.BOTTON_BUY, isVisible())
                        .forNoMoreThan(30).seconds(),
                Click.on(CheckOutPage.BOTTON_BUY)
        );
    }
}
