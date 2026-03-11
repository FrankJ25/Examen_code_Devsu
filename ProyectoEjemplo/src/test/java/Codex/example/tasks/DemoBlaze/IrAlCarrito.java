package Codex.example.tasks.DemoBlaze;

import Codex.example.userinterfaces.Demoblaze.CarritoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IrAlCarrito implements Task {

    public static IrAlCarrito ir() {
        return Tasks.instrumented(IrAlCarrito.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CarritoPage.CAR, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(CarritoPage.CAR)
        );
    }
}