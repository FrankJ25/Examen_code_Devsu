package Codex.example.stepdefinitions;

import Codex.example.tasks.OpenCart.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class OpenCartStepDefinitions {

    private final EnvironmentVariables environmentVariables =
            SystemEnvironmentVariables.createEnvironmentVariables();

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Usuario");
    }

    @Given("el usuario abre la pagina de OpenCart")
    public void elUsuarioAbreLaPaginaDeOpenCart() {
        String url = EnvironmentSpecificConfiguration
                .from(environmentVariables)
                .getProperty("base.url");

        theActorInTheSpotlight().attemptsTo(
                Open.url(url)
        );
    }

    @When("agrega los productos {string} y {string} al carrito en OpenCart")
    public void agregaLosProductosAlCarritoEnOpenCart(String producto1, String producto2) {
        theActorInTheSpotlight().attemptsTo(
                AgregarProductosOpenCart.con(producto1, producto2)
        );
    }

    @And("el usuario navega al carrito de compras en OpenCart")
    public void elUsuarioNavegaAlCarritoDeComprasEnOpenCart() {
        theActorInTheSpotlight().attemptsTo(
                IrAlCarritoOpenCart.ir()
        );
    }

    @And("el usuario procede al checkout como invitado en OpenCart")
    public void elUsuarioProcedeAlCheckoutComoInvitadoEnOpenCart() {
        theActorInTheSpotlight().attemptsTo(
                IniciarGuestCheckoutOpenCart.comoInvitado()
        );
    }

    @And("completa los datos de facturacion con nombre {string}, apellido {string}, email {string}, telefono {string}, direccion {string}, ciudad {string}, codigo postal {string}, pais {string}, region {string}")
    public void completaLosDatosDeFacturacion(String nombre, String apellido, String email, String telefono,
                                              String direccion, String ciudad, String codigoPostal,
                                              String pais, String region) {
        theActorInTheSpotlight().attemptsTo(
                CompletarDatosFacturacionOpenCart.con(nombre, apellido, email, telefono, direccion, ciudad, codigoPostal, pais, region)
        );
    }

    @Then("el usuario finaliza la compra exitosamente en OpenCart")
    public void elUsuarioFinalizaLaCompraExitosamenteEnOpenCart() {
        theActorInTheSpotlight().attemptsTo(
                FinalizarCompraOpenCart.confirmar()
        );
    }

    @And("se muestra el mensaje de confirmacion en OpenCart {string}")
    public void seMuestraElMensaje(String mensaje) {
        theActorInTheSpotlight().attemptsTo(
                ValidarMensajeConfirmacionOpenCart.con(mensaje)
        );
    }
}