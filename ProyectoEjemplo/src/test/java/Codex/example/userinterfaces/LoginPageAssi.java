package Yambal.example.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPageAssi {

    public static final Target USERNAME_INPUT = Target.the("campo nombre usuario").located(By.xpath("//input[@placeholder='Ingrese registro']"));
    public static final Target PASSWORD_INPUT = Target.the("campo paswword").located(By.xpath("//input[@placeholder='Ingrese clave de red']"));
    public static final Target LOGIN_BUTTON = Target.the("boton de login").located(By.className("ibk-button"));
    public static final Target TITULO_INICIO = Target.the("titulo inicio sesion").locatedBy("//*[@id=\"header_container\"]/div[1]/div[2]/div");

}
