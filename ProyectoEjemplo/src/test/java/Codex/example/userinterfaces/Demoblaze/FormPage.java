package Codex.example.userinterfaces.Demoblaze;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormPage {


    public static final Target PLACE_ORDER = Target.the("boton place order").located(By.xpath("//*[@id='page-wrapper']/div/div[2]/button"));
    public static final Target NAME = Target.the("campo nombre").located(By.xpath("//*[@id='name']"));
    public static final Target COUNTRY = Target.the("campo pais").located(By.xpath("//*[@id='country']"));
    public static final Target CITY = Target.the("campo ciudad").located(By.xpath("//*[@id='city']"));
    public static final Target CARD = Target.the("campo tarjeta").located(By.xpath("//*[@id='card']"));
    public static final Target MONTH = Target.the("campo mes").located(By.xpath("//*[@id='month']"));
    public static final Target YEAR = Target.the("campo año").located(By.xpath("//*[@id='year']"));
    public static final Target PURCHASE = Target.the("campo año").located(By.xpath("//*[@id='orderModal']/div/div/div[3]/button[2]"));



}
