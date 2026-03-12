package Codex.example.tasks.SauceDemo;

import Codex.example.userinterfaces.SauceDemo.ProductsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class IrAlCarritoSauceDemo implements Task {

    public static IrAlCarritoSauceDemo ir(){
        return Tasks.instrumented(IrAlCarritoSauceDemo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(ProductsPage.CART_BUTTON)
        );
    }
}