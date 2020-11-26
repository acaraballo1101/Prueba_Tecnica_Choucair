package co.com.choucair.certification.testtecnical.stepdefinitions;

import co.com.choucair.certification.testtecnical.questions.Answer;
import co.com.choucair.certification.testtecnical.tasks.Login;
import co.com.choucair.certification.testtecnical.tasks.OpenUp;
import co.com.choucair.certification.testtecnical.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class TestTecnicalStepDefinitions {

    @Before
    public void setStage (){

        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que (.*) quiere hacer un curso en la pagina Academia Choucair")
    public void queAndresQuiereHacerUnCursoEnLaPaginaAcademiaChoucair(String actor) {
        OnStage.theActorCalled(actor).wasAbleTo(OpenUp.thePage(), (Login.OnThePage()));
    }

    @Cuando("busca cursos (.*)")
    public void buscaCursosRecursosDeAutomatizacionBancolombia(String curso) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(curso));
    }

    @Entonces("se debe visualizar en el titulo (.*)")
    public void seDebeVisualizarEnElTituloRecursosDeAutomatizacionBancolombia(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
