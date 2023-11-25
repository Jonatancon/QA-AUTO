package starter.udea.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import starter.udea.navigation.NavigateSSMU;
import starter.udea.search.TaskSSMU;

public class SSMURecoveryStepdefinitions {
    @Given("{actor} forgot his password")
    public void enterHomepage(Actor actor) {
        actor.wasAbleTo(NavigateSSMU.theSearchHomePage());
        actor.attemptsTo(TaskSSMU.clickMissingPassword());
    }


    @When("{actor} enter your email address {string}")
    public void heEnterYourEmailAddressJhonatanloraGmailCom(Actor actor, String email) {
        actor.attemptsTo(
                TaskSSMU.enterEmailMissingPassword(email)
        );
    }

    @And("{actor} enters the code sent to the email {string}")
    public void heEntersTheCodeSentToTheEmail(Actor actor, String code) {
        actor.attemptsTo(
                TaskSSMU.enterCode(code)
        );
    }

    @Then("{actor} should enter a new password {string}")
    public void heShouldEnterANewPassword(Actor actor, String newPassword) {
        actor.attemptsTo(
                TaskSSMU.enterNewPassword(newPassword)
        );
    }

    @And("{actor} should see the home page")
    public void heShouldSeeTheHomePage(Actor actor) {
        actor.attemptsTo(
                Ensure.that(TheWebPage.currentUrl()).containsIgnoringCase("http://localhost:3000/")
        );
    }
}
