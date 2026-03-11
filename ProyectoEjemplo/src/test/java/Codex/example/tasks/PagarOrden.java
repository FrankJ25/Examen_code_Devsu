package Yambal.example.tasks;

import Yambal.example.userinterfaces.CheckOutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PagarOrden implements Task {

    private final String tipoPago;

    // Constructor con parámetro
    public PagarOrden(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    // Factory Method
    public static Performable con(String tipoPago) {
        return instrumented(PagarOrden.class, tipoPago);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        // Esperar pantalla de checkout
      //  actor.attemptsTo(
      //          WaitUntil.the(CheckOutPage.TITULO_CHECKOUT, isVisible())
      //                  .forNoMoreThan(30).seconds()
      //  );

        // 👉 Elegir método de pago
        if (tipoPago.equalsIgnoreCase("CreditoYambal")) {

          //  actor.attemptsTo(
//
          //          Click.on(CheckOutPage.OPCION_CREDITO_YAMBAL),
//
          //          WaitUntil.the(CheckOutPage.BTN_CONFIRMAR_PAGO, isVisible())
          //                  .forNoMoreThan(20).seconds(),
//
          //          Click.on(CheckOutPage.BTN_CONFIRMAR_PAGO)
            //    );
//
        } else if (tipoPago.equalsIgnoreCase("Tarjeta de credito")) {

         //   actor.attemptsTo(
//
         //           Click.on(CheckOutPage.OPCION_TARJETA_CREDITO),
//
         //           WaitUntil.the(CheckOutPage.BTN_CONFIRMAR_PAGO, isVisible())
         //                   .forNoMoreThan(20).seconds(),
//
         //           Click.on(CheckOutPage.BTN_CONFIRMAR_PAGO)
         //   );

        } else {

            throw new RuntimeException("❌ Tipo de pago no soportado: " + tipoPago);

        }
    }
}
