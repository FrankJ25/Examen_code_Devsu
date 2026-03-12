package Codex.example.tasks.SauceDemo;

import Codex.example.userinterfaces.SauceDemo.ProductsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarProductosSauceDemo implements Task {

    private String producto1;
    private String producto2;

    public AgregarProductosSauceDemo(String producto1, String producto2){
        this.producto1 = producto1;
        this.producto2 = producto2;
    }

    public static Performable con(String producto1, String producto2){
        return Tasks.instrumented(AgregarProductosSauceDemo.class, producto1, producto2);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ProductsPage.ADD_TO_CART_BUTTON.of(producto1), isVisible())
                        .forNoMoreThan(30).seconds(),
                Click.on(ProductsPage.ADD_TO_CART_BUTTON.of(producto1)),

                WaitUntil.the(ProductsPage.ADD_TO_CART_BUTTON.of(producto2), isVisible())
                        .forNoMoreThan(30).seconds(),
                Click.on(ProductsPage.ADD_TO_CART_BUTTON.of(producto2)),

                WaitUntil.the(ProductsPage.CART_BUTTON, isVisible())
                        .forNoMoreThan(30).seconds(),
                Click.on(ProductsPage.CART_BUTTON)
        );
    }
}