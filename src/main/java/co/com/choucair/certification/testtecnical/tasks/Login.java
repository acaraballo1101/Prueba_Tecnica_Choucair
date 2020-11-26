package co.com.choucair.certification.testtecnical.tasks;

import co.com.choucair.certification.testtecnical.userinterface.FavoriteLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    public static Login OnThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FavoriteLoginPage.BOTON_ACCEDER),
                Enter.theValue("1143348819").into(FavoriteLoginPage.CAJA_CORREO),
                Enter.theValue("Choucair2020*").into(FavoriteLoginPage.CAJA_PASSWORD),
                Click.on(FavoriteLoginPage.BOTON_SIGUIENTE_PWD)
                );
    }
}
