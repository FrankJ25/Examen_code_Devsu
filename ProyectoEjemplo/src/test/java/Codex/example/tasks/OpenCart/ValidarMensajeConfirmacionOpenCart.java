package Codex.example.tasks.OpenCart;

import Codex.example.userinterfaces.OpenCart.SuccessPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class ValidarMensajeConfirmacionOpenCart implements Task {

    private final String mensaje;

    public ValidarMensajeConfirmacionOpenCart(String mensaje) {
        this.mensaje = mensaje;
    }

    public static Performable con(String mensaje) {
        return Tasks.instrumented(ValidarMensajeConfirmacionOpenCart.class, mensaje);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(
                seeThat(Text.of(SuccessPage.SUCCESS_MESSAGE), containsString(mensaje))
        );
    }
}