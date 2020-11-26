package co.com.choucair.certification.testtecnical.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchItemPage extends PageObject {
    public static final Target BTN_CURSOS_CERT = Target.the("Clic en Cursos y certificaciones").located(By.xpath("//div[@id='certificaciones']//strong"));
    public static final Target CAJA_BUSQUEDA = Target.the("Cuadro de Busqueda").located(By.xpath("//input[@id='coursesearchbox']"));
    public static final Target BOTON_BUSCAR = Target.the("Boton Buscar").located(By.xpath("//button[@class='btn btn-secondary']"));
    public static final Target CLIC_EN_ARTICULO = Target.the("Clic en best seller de la pagina").locatedBy("//a[@href='https://operacion.choucairtesting.com/academy/course/view.php?id=1278']");
    public static final Target NOMBRE_DEL_ARTICULO = Target.the("Extrae los Best seller").located(By.xpath("//h1[contains(text(),'Workshop')]"));
}


