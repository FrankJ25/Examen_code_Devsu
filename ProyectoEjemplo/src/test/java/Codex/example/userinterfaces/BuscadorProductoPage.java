package Yambal.example.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuscadorProductoPage {

    public static final Target BUSCADOR_PRODUCTO = Target.the("campo buscar producto").located(By.xpath("//*[@id='searchInput']"));
    public static final Target INSERTAR_PRODUCTO = Target.the("campo buscar producto").located(By.xpath("//*[@id='results']/ul[2]"));

}
