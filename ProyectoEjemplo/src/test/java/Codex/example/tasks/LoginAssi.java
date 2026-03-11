package Yambal.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import Yambal.example.userinterfaces.LoginPageAssi;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginAssi implements Task {


    private static String user;
    private static String pass;

    public LoginAssi(String user, String pass){
        this.user=user;
        this.pass=pass;
    }
    // Metodo Constructor que inicializa los campos user y pass con los datos recibidos.
    public static Performable withData(String user, String pass){
        return instrumented(LoginAssi.class,user,pass);
    }

    //Método estático que devuelve una instancia de Login como un objeto Performable, que representa una tarea que el actor puede realizar.

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LoginPageAssi.USERNAME_INPUT, isVisible()).forNoMoreThan(30).seconds(),
                Enter.theValue(user).into(LoginPageAssi.USERNAME_INPUT),
                Enter.theValue(pass).into(LoginPageAssi.PASSWORD_INPUT),
                Click.on(LoginPageAssi.LOGIN_BUTTON)

        );

    }
}

