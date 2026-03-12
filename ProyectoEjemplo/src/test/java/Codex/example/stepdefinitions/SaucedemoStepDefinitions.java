
package Codex.example.stepdefinitions;

import Codex.example.tasks.SauceDemo.*;
        import io.cucumber.java.Before;
import io.cucumber.java.en.*;
        import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.model.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class SaucedemoStepDefinitions {

    private EnvironmentVariables environmentVariables;

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Usuario");
    }

    @Given("el usuario abre la pagina de SauceDemo")
    public void elUsuarioAbreLaPagina() {

        String url = EnvironmentSpecificConfiguration
                .from(environmentVariables)
                .getProperty("base.url");

        theActorInTheSpotlight().attemptsTo(
                Open.url(url)
        );
    }

    @When("inicia sesion con usuario {string} y clave {string}")
    public void iniciaSesion(String usuario, String clave) {

        theActorInTheSpotlight().attemptsTo(
                LoginSauceDemo.con(usuario, clave)
        );
    }

    @And("agrega los productos {string} y {string} al carrito")
    public void agregaProductos(String producto1, String producto2) {

        theActorInTheSpotlight().attemptsTo(
                AgregarProductosSauceDemo.con(producto1, producto2)
        );
    }

    @And("el usuario navega al carrito de compras en SauceDemo")
    public void irAlCarrito() {

        theActorInTheSpotlight().attemptsTo(
                IrAlCarritoSauceDemo.ir()
        );
    }

    @And("completa el checkout con nombre {string}, apellido {string}, codigo postal {string}")
    public void completarCheckout(String nombre, String apellido, String codigoPostal) {

        theActorInTheSpotlight().attemptsTo(
                CompletarCheckoutSauceDemo.con(nombre, apellido, codigoPostal)
        );
    }

    @Then("el usuario finaliza la compra exitosamente")
    public void finalizarCompra() {

        theActorInTheSpotlight().attemptsTo(
                FinalizarCompraSauceDemo.confirmar()
        );
    }

    @And("se muestra el mensaje de confirmacion en SauceDemo {string}")
    public void validarMensaje(String mensaje) {

        theActorInTheSpotlight().attemptsTo(
                ValidarMensajeConfirmacionSauceDemo.con(mensaje)
        );
    }
}