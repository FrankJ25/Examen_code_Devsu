package Yambal.example.tasks;

import Yambal.example.userinterfaces.ProductoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ProductoYambal implements Task {

    // ✅ Ya NO es static
    private final String nroProducto;

    // ✅ Constructor correcto
    public ProductoYambal(String nroProducto) {
        this.nroProducto = nroProducto;
    }

    // ✅ Factory Method
    public static Performable con(String nroProducto) {
        return instrumented(ProductoYambal.class, nroProducto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                // 1️⃣ Esperar input
                WaitUntil.the(ProductoPage.NRO_PRODUCTO, isVisible())
                        .forNoMoreThan(30).seconds(),

                // 2️⃣ Limpiar campo
                Clear.field(ProductoPage.NRO_PRODUCTO),

                // 3️⃣ Escribir producto
                Enter.theValue(nroProducto)
                        .into(ProductoPage.NRO_PRODUCTO),

                // 4️⃣ Esperar botón
                WaitUntil.the(ProductoPage.BOTTON_AGREGAR_BOLSA, isClickable())
                        .forNoMoreThan(20).seconds(),

                // 5️⃣ Click Agregar
                Click.on(ProductoPage.BOTTON_AGREGAR_BOLSA)
        );
    }
}
