package Codex.example.tasks.DemoBlaze;

import Codex.example.userinterfaces.Demoblaze.ProductoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarProductosDemoblaze implements Task {

    private final String producto1;
    private final String producto2;

    public AgregarProductosDemoblaze(String producto1, String producto2) {
        this.producto1 = producto1;
        this.producto2 = producto2;
    }

    public static Performable withData(String producto1, String producto2) {
        return instrumented(AgregarProductosDemoblaze.class, producto1, producto2);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ProductoPage.producto(producto1), isVisible()).forNoMoreThan(30).seconds(),
                Click.on(ProductoPage.producto(producto1)),

                WaitUntil.the(ProductoPage.AGREGAR, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(ProductoPage.AGREGAR),
                ValidarYAceptarAlertaProducto.conMensaje("Product added"),

                WaitUntil.the(ProductoPage.HOME, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(ProductoPage.HOME),

                WaitUntil.the(ProductoPage.producto(producto2), isVisible()).forNoMoreThan(30).seconds(),
                Click.on(ProductoPage.producto(producto2)),

                WaitUntil.the(ProductoPage.AGREGAR, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(ProductoPage.AGREGAR),
                ValidarYAceptarAlertaProducto.conMensaje("Product added"),

                WaitUntil.the(ProductoPage.HOME, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(ProductoPage.HOME)
        );
    }
}