

package Codex.example.stepdefinitions;
import Codex.example.tasks.DemoBlaze.AgregarProductosDemoblaze;
import Codex.example.tasks.DemoBlaze.CompletarFormularioCompra;
import Codex.example.tasks.DemoBlaze.FinalizarCompra;
import Codex.example.tasks.DemoBlaze.IrAlCarrito;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DemoblazeStepDefinition {


    private final EnvironmentVariables environmentVariables =
            SystemEnvironmentVariables.createEnvironmentVariables();

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Usuario");
    }

    @Given("el usuario abre la pagina de Demoblaze")
    public void elUsuarioAbreLaPagina() {
        String url = EnvironmentSpecificConfiguration
                .from(environmentVariables)
                .getProperty("base.url");

        theActorInTheSpotlight().attemptsTo(
                Open.url(url)
        );
    }

    @When("el usuario agrega los productos {string} y {string} al carrito")
    public void elUsuarioAgregaLosProductosAlCarrito(String producto1, String producto2) {
        theActorInTheSpotlight().attemptsTo(
                AgregarProductosDemoblaze.withData(producto1, producto2)
        );
    }

    @And("el usuario navega al carrito de compras en Demoblaze")
    public void elUsuarioNavegaAlCarritoDeCompras() {
        theActorInTheSpotlight().attemptsTo(
                IrAlCarrito.ir()
        );
    }

    @And("completa el formulario con nombre {string}, pais {string}, ciudad {string}, tarjeta {string}, mes {string}, año {string}")
    public void completaElFormularioConNombrePaisCiudadTarjetaMesAnio(String nombre, String pais, String ciudad, String tarjeta, String mes, String anio)
    {
        theActorInTheSpotlight().attemptsTo(
                CompletarFormularioCompra.con(nombre, pais, ciudad, tarjeta, mes, anio)
        );
    }

    @Then("el usuario finaliza la compra exitosamente en Demoblaze")
    public void elUsuarioFinalizaLaCompraExitosamente() {
        theActorInTheSpotlight().attemptsTo(
                FinalizarCompra.confirmar()
        );
    }

    @And("se muestra el mensaje de confirmacion de compra")
    public void seMuestraElMensajeDeConfirmacionDeCompra() {
    }




}
