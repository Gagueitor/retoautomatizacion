package automatizacion.stepdefinitions;
import automatizacion.tasks.FillOutForm;
import automatizacion.tasks.OpenUp;
import automatizacion.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import automatizacion.questions.Answer;


public class stepdefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^que se ingresa a Utest$")
    public void queSeIngresaAUtest() {
        OnStage.theActorCalled( "Martha").wasAbleTo(OpenUp.thePague(), (Register.onthePague()));

    }


    @When("^un usuario diligencia el formulario de registro$")
    public void unUsuarioDiligenciaElFormularioDeRegistro() {
        OnStage.theActorInTheSpotlight().attemptsTo(FillOutForm.the());

    }

    @Then("^debera existir un nuevo usuario con los datos registrados$")
    public void deberaExistirUnNuevoUsuarioConLosDatosRegistrados(){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe("Welcome to the world's largest community of freelance software testers!")));



    }
}
