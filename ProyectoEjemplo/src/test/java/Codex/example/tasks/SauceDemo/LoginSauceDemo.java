package Codex.example.tasks.SauceDemo;

import Codex.example.userinterfaces.SauceDemo.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginSauceDemo implements Task {

    private String usuario;
    private String clave;

    public LoginSauceDemo(String usuario, String clave){
        this.usuario = usuario;
        this.clave = clave;
    }

    public static Performable con(String usuario, String clave){
        return Tasks.instrumented(LoginSauceDemo.class, usuario, clave);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(usuario).into(LoginPage.USERNAME),
                Enter.theValue(clave).into(LoginPage.PASSWORD),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }
}