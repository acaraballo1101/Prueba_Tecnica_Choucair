package co.com.choucair.certification.testtecnical.tasks;

import co.com.choucair.certification.testtecnical.userinterface.SearchItemPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class Search implements Task {
    private String curso;

    public Search(String curso) {
        this.curso = curso;
    }

    public static Search the(String curso) {
        return Tasks.instrumented(Search.class,curso);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SearchItemPage.BTN_CURSOS_CERT),
                Enter.theValue(curso).into(SearchItemPage.CAJA_BUSQUEDA),
                Click.on(SearchItemPage.BOTON_BUSCAR),
                Click.on(SearchItemPage.CLIC_EN_ARTICULO)

                );


    }
}
