//package Yambal.example.utils;
//
//import net.serenitybdd.core.Serenity;
//import net.serenitybdd.core.pages.PageObject;
//import org.htmlunit.xpath.operations.String;
//import org.openqa.selenium.By;
//import org.openqa.selenium.SearchContext;
//import org.openqa.selenium.WebElement;
//
//import java.util.List;
//
//public class Shadow extends PageObject {
//
//    public SearchContext expandRootElement(WebElement element) {
//        SearchContext shadowRoot = element.getShadowRoot();
//        return shadowRoot;
//    }
//
//    public WebElement expandContainer(String numeroCss, WebElement elementoBase, String elemento1, String elemento2, String elemento3, String elemento4) {
//        WebElement resultado = null;
//        List<WebElement> resultados = null;
//        switch (numeroCss) {
//            case "1css": {
//                SearchContext shadowRoot = expandRootElement(elementoBase);
//                resultado = shadowRoot.findElement(By.cssSelector(elemento1));
//                break;
//            }
//            case "2css": {
//                SearchContext shadowRoot1 = expandRootElement(elementoBase);
//                WebElement rootGenerico = shadowRoot1.findElement(By.cssSelector(elemento1));
//                SearchContext shadowRoot2 = expandRootElement(rootGenerico);
//                resultado = shadowRoot2.findElement(By.cssSelector(elemento2));
//                break;
//            }
//            case "3css": {
//                SearchContext shadowRoot1 = expandRootElement(elementoBase);
//                WebElement rootGenerico = shadowRoot1.findElement(By.cssSelector(elemento1));
//                SearchContext shadowRoot2 = expandRootElement(rootGenerico);
//                WebElement rootGenerico2 = shadowRoot2.findElement(By.cssSelector(elemento2));
//                SearchContext shadowRoot3 = expandRootElement(rootGenerico2);
//                resultado = shadowRoot3.findElement(By.cssSelector(elemento3));
//                break;
//            }
//            case "4css": {
//                SearchContext shadowRoot1 = expandRootElement(elementoBase);
//                WebElement rootGenerico = shadowRoot1.findElement(By.cssSelector(elemento1));
//
//                SearchContext shadowRoot2 = expandRootElement(rootGenerico);
//                WebElement rootGenerico2 = shadowRoot2.findElement(By.cssSelector(elemento2));
//
//                SearchContext shadowRoot3 = expandRootElement(rootGenerico2);
//                WebElement rootGenerico3 = shadowRoot3.findElement(By.cssSelector(elemento3));
//
//                SearchContext shadowRoot4 = expandRootElement(rootGenerico3);
//                resultado = shadowRoot4.findElement(By.cssSelector(elemento4));
//                break;
//            }
//            case "2cssid": {
//                SearchContext shadowRoot1 = expandRootElement(elementoBase);
//                WebElement rootGenerico = shadowRoot1.findElement(By.cssSelector(elemento1));
//                SearchContext shadowRoot2 = expandRootElement(rootGenerico);
//                resultado = shadowRoot2.findElement(By.id(elemento2));
//                break;
//            }
//            case "2cssSize": {
//                SearchContext shadowRoot1 = expandRootElement(elementoBase);
//                WebElement rootGenerico = shadowRoot1.findElement(By.cssSelector(elemento1));
//                SearchContext shadowRoot2 = expandRootElement(rootGenerico);
//                resultado = shadowRoot2.findElement(By.cssSelector(elemento2));
//                int cantidad = shadowRoot2.findElements(By.cssSelector(elemento2)).size();
//                Serenity.setSessionVariable("cantidadTable").to(cantidad);
//                break;
//            }
//            case "1className": {
//                SearchContext shadowRoot1 = expandRootElement(elementoBase);
//                resultado = shadowRoot1.findElement(By.className(elemento1));
//                break;
//            }
//            case "1id": {
//                SearchContext shadowRoot = expandRootElement(elementoBase);
//                resultado = shadowRoot.findElement(By.id(elemento1));
//                break;
//            }
//        }
//        return resultado;
//    }
//
//    public List<WebElement> expandContainer2(String numeroCss, WebElement elementoBase, String elemento1, String elemento2, String elemento3, String elemento4) {
//        List<WebElement> resultados = null;
//        switch (numeroCss) {
//            case "2cssList": {
//                SearchContext shadowRoot1 = expandRootElement(elementoBase);
//                WebElement rootGenerico = shadowRoot1.findElement(By.cssSelector(elemento1));
//                SearchContext shadowRoot2 = expandRootElement(rootGenerico);
//                resultados = shadowRoot2.findElements(By.cssSelector(elemento2));
//                //Serenity.setSessionVariable("cantidadTable").to(cantidad);
//                break;
//            }
//        }
//        return resultados;
//    }
//
//}
//