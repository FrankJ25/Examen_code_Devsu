package Codex.example.userinterfaces.Demoblaze;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPageYambal {

    public static final Target USERNAME_INPUT = Target.the("campo nombre usuario").located(By.xpath("//*[@id='signInName']"));
    public static final Target PASSWORD_INPUT = Target.the("campo paswword").located(By.xpath("//*[@id='password']"));
    public static final Target LOGIN_BUTTON = Target.the("boton de login").located(By.xpath("//*[@id='submit']"));

}
