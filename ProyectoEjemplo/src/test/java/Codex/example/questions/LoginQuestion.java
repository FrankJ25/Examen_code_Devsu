package Yambal.example.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import Yambal.example.userinterfaces.LoginPageAssi;

public class LoginQuestion {

    public static Question<String> tituloIngreso(){
        return actor -> TextContent.of(LoginPageAssi.TITULO_INICIO).answeredBy(actor);
    }

    //Este código define un método que hace una pregunta a un actor,
    // pidiéndole que recupere el contenido de texto .
    // La pregunta devuelve el texto como una cadena (String).
}
