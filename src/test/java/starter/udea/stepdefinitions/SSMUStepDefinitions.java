package starter.udea.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import starter.udea.navigation.NavigateSSMU;
import starter.udea.navigation.SSMUHomePage;
import starter.udea.search.TaskSSMU;

public class SSMUStepDefinitions {
    @Given("{actor} wants to log in")
    public void usuarioQuiereIniciarSesion(Actor actor) {
        actor.wasAbleTo(NavigateSSMU.theSearchHomePage());
    }
    @When("{actor} enters his user {string} and password {string}")
    public void elIngresaSuUsuarioElzaJacobsGmailComYPasswordAfyAHCuNDxuMY(Actor actor, String user, String password) {
        actor.attemptsTo(
                TaskSSMU.enterUser(user)
        );

        actor.attemptsTo(
                TaskSSMU.enterPassword(password)
        );
    }

    @Then("{actor} is logged in correctly and his profile is {string}")
    public void elIniciaSesionCorrectamenteYSuPerfilEsUSUARIO(Actor actor, String rol) {
        actor.attemptsTo(
                Ensure.that(SSMUHomePage.ROL).hasText(rol)
        );
    }

    @Then("{actor} fails to log in and sees a message {string}")
    public void heFailsToLogInAndSeesAMessageUsuarioOContrasenaIncorrectos(Actor actor, String message) {
        actor.attemptsTo(
                Ensure.that(SSMUHomePage.MESSAGE).hasText(message)
        );
    }

    @Given("{actor} is actively logged in")
    public void customerIsActivelyLoggedIn(Actor actor) {
        actor.wasAbleTo(NavigateSSMU.theSearchHomePage());
        actor.attemptsTo(
                TaskSSMU.enterUser("Edison.Tremblay@hotmail.com")
        );

        actor.attemptsTo(
                TaskSSMU.enterPassword("7MwtQ7N12omQkKM")
        );

    }

    @When("{actor} closes the section")
    public void heClosesTheSection(Actor actor) {
        actor.attemptsTo(
                TaskSSMU.logOut()
        );
    }

    @Then("{actor} should see the logon screen")
    public void heShouldSeeTheLogonScreen(Actor actor) {
        actor.attemptsTo(
                Ensure.that(TheWebPage.currentUrl()).containsIgnoringCase("http://localhost:3000/")
        );
    }
}
