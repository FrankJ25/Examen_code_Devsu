package Codex.example.tasks.DemoBlaze;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ValidarYAceptarAlertaProducto implements Task {

    private final String mensajeEsperado;

    public ValidarYAceptarAlertaProducto(String mensajeEsperado) {
        this.mensajeEsperado = mensajeEsperado;
    }

    public static ValidarYAceptarAlertaProducto conMensaje(String mensajeEsperado) {
        return Tasks.instrumented(ValidarYAceptarAlertaProducto.class, mensajeEsperado);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            String mensajeReal = alert.getText();

            Assert.assertEquals(
                    "El mensaje de la alerta no es el esperado",
                    mensajeEsperado,
                    mensajeReal
            );

            alert.accept();

        } catch (TimeoutException e) {
            throw new AssertionError("No apareció la alerta dentro del tiempo esperado.");
        }
    }
}