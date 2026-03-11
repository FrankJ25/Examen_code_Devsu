package Codex.example.tasks.DemoBlaze;

import Codex.example.userinterfaces.Demoblaze.FinishPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FinalizarCompra implements Task {

    public static FinalizarCompra confirmar() {
        return Tasks.instrumented(FinalizarCompra.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(FinishPage.PURCHASE, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(FinishPage.PURCHASE),

                WaitUntil.the(FinishPage.FINISH, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(FinishPage.FINISH)
        );
    }
}