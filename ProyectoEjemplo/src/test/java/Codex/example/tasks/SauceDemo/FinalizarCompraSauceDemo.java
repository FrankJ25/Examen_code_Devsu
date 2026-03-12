package Codex.example.tasks.SauceDemo;

import Codex.example.userinterfaces.SauceDemo.OverviewPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class FinalizarCompraSauceDemo implements Task {

    public static FinalizarCompraSauceDemo confirmar(){
        return Tasks.instrumented(FinalizarCompraSauceDemo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(OverviewPage.FINISH_BUTTON)
        );
    }
}