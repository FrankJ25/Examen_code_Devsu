package Codex.example.userinterfaces.Demoblaze;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FinishPage {


    public static final Target PURCHASE = Target.the("campo registro").located(By.xpath("//*[@id='orderModal']/div/div/div[3]/button[2]"));
    public static final Target FINISH = Target.the("campo registro").located(By.xpath("/html/body/div[10]/div[7]/div/button"));



}
