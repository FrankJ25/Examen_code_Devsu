package Yambal.example.tasks;

import Yambal.example.userinterfaces.BuscadorProductoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.InputStream;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ProductoTienda implements Task {

    // ==========================
    // CONSTRUCTOR VACÍO
    // ==========================
    public ProductoTienda() {
    }

    // ==========================
    // FACTORY METHOD
    // ==========================
    public static Performable agregar() {
        return instrumented(ProductoTienda.class);
    }

    // ==========================
    // EJECUCIÓN DEL TASK
    // ==========================
    @Override
    public <T extends Actor> void performAs(T actor) {

        // 1️⃣ Leer producto desde Excel
        String producto = leerProductoDesdeExcel();

        System.out.println(">>> PRODUCTO DESDE EXCEL = [" + producto + "]");

        if (producto.isEmpty()) {
            throw new RuntimeException("❌ El producto del Excel está vacío");
        }

        // 2️⃣ Usar producto en la web
        actor.attemptsTo(

                // Esperar buscador
                WaitUntil.the(BuscadorProductoPage.BUSCADOR_PRODUCTO, isVisible())
                        .forNoMoreThan(20).seconds(),

                // Escribir producto
                Enter.theValue(producto)
                        .into(BuscadorProductoPage.BUSCADOR_PRODUCTO),

                // Esperar resultado
                WaitUntil.the(BuscadorProductoPage.INSERTAR_PRODUCTO, isVisible())
                        .forNoMoreThan(20).seconds(),

                // Click en producto
                Click.on(BuscadorProductoPage.INSERTAR_PRODUCTO)
        );
    }

    // ==========================
    // LECTURA DE EXCEL
    // ==========================
    private String leerProductoDesdeExcel() {

        try {

            // Cargar archivo
            InputStream file = getClass()
                    .getClassLoader()
                    .getResourceAsStream("Archivos/dataPrueba.xlsx");

            if (file == null) {
                throw new RuntimeException("❌ No se encontró Archivos/dataPrueba.xlsx");
            }

            Workbook workbook = new XSSFWorkbook(file);

            // Hoja
            Sheet sheet = workbook.getSheet("DatosPedido");

            if (sheet == null) {
                throw new RuntimeException("❌ No existe hoja DatosPedido");
            }

            // Fila 2 (index 1)
            Row row = sheet.getRow(1);

            if (row == null) {
                throw new RuntimeException("❌ No existe fila 2");
            }

            // Columna E (index 4)
            Cell cell = row.getCell(4);

            if (cell == null) {
                throw new RuntimeException("❌ No existe columna E");
            }

            // ✅ Formateador (evita notación científica)
            DataFormatter formatter = new DataFormatter();

            String producto = formatter.formatCellValue(cell);

            workbook.close();
            file.close();

            return producto.trim();

        } catch (Exception e) {

            throw new RuntimeException(
                    "❌ Error leyendo Excel: " + e.getMessage(), e
            );
        }
    }
}
