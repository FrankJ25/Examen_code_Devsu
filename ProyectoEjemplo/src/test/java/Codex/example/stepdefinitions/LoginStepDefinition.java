

package Yambal.example.stepdefinitions;

import Yambal.example.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinition {

    private EnvironmentVariables environmentVariables =
            SystemEnvironmentVariables.createEnvironmentVariables();

    @Before
    public void setUp() {

        // Inicializa Screenplay
        OnStage.setTheStage(new OnlineCast());

        // Crea el actor
        theActorCalled("Consultor");
    }

    @Given("el usuario abre el portal en {string} para {string}")
    public void abrirPortal(String ambiente, String pais) {

        String env = ambiente + "_" + pais;
        // Setear environment siempre
        System.setProperty("environment", env);
        System.out.println("Ambiente activo: " + env);
        String url = EnvironmentSpecificConfiguration
                .from(environmentVariables)
                .getProperty("base.url");
        System.out.println("URL: " + url);
        theActorInTheSpotlight().attemptsTo(
                Open.url(url)
        );
    }

    @When("^inicia sesión con (.*) y (.*)$")
    public void iniciaSesionConUsuarioYClave(String usuario, String clave) {

        theActorInTheSpotlight().attemptsTo(
                LoginYambal.con(usuario, clave)
        );
    }

    @And("se agrega producto al carrito de compras")
    public void agregaProductosCarrito() {

        theActorInTheSpotlight().attemptsTo(
                ProductoTienda.agregar()
        );
    }

    @And("se escoge {int} productos al carrito de compras y se agrega a la bolsa")
    public void productosACaja(Integer nroProductos) {

        String producto = String.valueOf(nroProductos);

        theActorInTheSpotlight().attemptsTo(
                ProductoYambal.con(producto)
        );
    }
    @And("se Ingresa al check out y se valida el resumen del pedido")
    public void ingresocheck() {
        theActorInTheSpotlight().attemptsTo(
                validacionCheckout.checkout()
        );
    }



    @And("^se procede a pagar con (CreditoYambal|Tarjeta de credito)$")
    public void pagoyambal(String tipoPago) {

        theActorInTheSpotlight().attemptsTo(
                PagarOrden.con(tipoPago)
        );
    }

    @And("^se valida el historial del pedido$")
    public void validahistorial() {
    }


}
