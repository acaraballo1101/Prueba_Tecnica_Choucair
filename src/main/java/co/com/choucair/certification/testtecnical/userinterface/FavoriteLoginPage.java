package co.com.choucair.certification.testtecnical.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FavoriteLoginPage extends PageObject {

    public static final Target BOTON_ACCEDER = Target.the("Boton Sig In").located(By.xpath("//a[@class='btn btn-info btn-sm text-white']"));
    public static final Target CAJA_CORREO = Target.the("Caja de texto para ingresar el correo").located(By.xpath("//input[@id='username']"));
    public static final Target CAJA_PASSWORD = Target.the("Caja de texto para ingresar password").located(By.xpath("//input[@name='password']"));
    public static final Target BOTON_SIGUIENTE_PWD = Target.the("Boton iniciar Sesion").located(By.xpath("//button[@type='submit']"));
}
