package Yambal.example.tasks;

import Yambal.example.userinterfaces.LoginPageYambal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginYambal implements Task {

    private final String user;
    private final String pass;

    // Constructor
    public LoginYambal(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    // ✅ Factory Method correcto
    public static Performable con(String user, String pass) {
        return instrumented(LoginYambal.class, user, pass);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(LoginPageYambal.USERNAME_INPUT, isVisible()).forNoMoreThan(30).seconds(),
                Enter.theValue(user).into(LoginPageYambal.USERNAME_INPUT),
                Enter.theValue(pass).into(LoginPageYambal.PASSWORD_INPUT),
                Click.on(LoginPageYambal.LOGIN_BUTTON)

        );
    }
}
