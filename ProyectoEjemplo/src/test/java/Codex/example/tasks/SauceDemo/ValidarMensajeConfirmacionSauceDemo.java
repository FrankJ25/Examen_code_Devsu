package Codex.example.tasks.SauceDemo;

import Codex.example.userinterfaces.SauceDemo.FinishPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class ValidarMensajeConfirmacionSauceDemo implements Task {

    private String mensaje;

    public ValidarMensajeConfirmacionSauceDemo(String mensaje){
        this.mensaje = mensaje;
    }

    public static Performable con(String mensaje){
        return Tasks.instrumented(ValidarMensajeConfirmacionSauceDemo.class, mensaje);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(
                seeThat(Text.of(FinishPage.MESSAGE_CONFIRMATION), containsString(mensaje))
        );
    }
}