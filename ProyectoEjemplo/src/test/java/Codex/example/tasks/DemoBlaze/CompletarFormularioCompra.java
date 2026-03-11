package Codex.example.tasks.DemoBlaze;

import Codex.example.userinterfaces.Demoblaze.FormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CompletarFormularioCompra implements Task {

    private String nombre;
    private String pais;
    private String ciudad;
    private String tarjeta;
    private String mes;
    private String anio;

    public CompletarFormularioCompra(String nombre, String pais, String ciudad, String tarjeta, String mes, String anio) {
        this.nombre = nombre;
        this.pais = pais;
        this.ciudad = ciudad;
        this.tarjeta = tarjeta;
        this.mes = mes;
        this.anio = anio;
    }

    public static Performable con(String nombre, String pais, String ciudad, String tarjeta, String mes, String anio) {
        return Tasks.instrumented(
                CompletarFormularioCompra.class,
                nombre, pais, ciudad, tarjeta, mes, anio
        );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(FormPage.PLACE_ORDER, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(FormPage.PLACE_ORDER),
                Enter.theValue(nombre).into(FormPage.NAME),
                Enter.theValue(pais).into(FormPage.COUNTRY),
                Enter.theValue(ciudad).into(FormPage.CITY),
                Enter.theValue(tarjeta).into(FormPage.CARD),
                Enter.theValue(mes).into(FormPage.MONTH),
                Enter.theValue(anio).into(FormPage.YEAR)
               // Click.on(FormPage.PURCHASE)
        );
    }
}