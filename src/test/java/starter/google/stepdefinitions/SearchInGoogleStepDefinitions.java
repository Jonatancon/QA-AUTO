package starter.google.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.junit.jupiter.api.RepeatedTest;
import starter.google.navigation.NavigateToGoogle;
import starter.google.search.LookInformationGoogle;

public class SearchInGoogleStepDefinitions {
    @Given("{actor} wants to search for amazon store on google")
    public void researchingThings(Actor actor) {
        actor.wasAbleTo(NavigateToGoogle.theSearchHomePage());
    }

    @When("{actor} looks up {string} in google")
    public void searchesFor(Actor actor, String term) {
        actor.attemptsTo(
                LookInformationGoogle.about(term)
        );
    }
    @Then("{actor} should see information about {string} in google")
    public void heShouldSeeInformationAboutInGoogle(Actor actor, String term) {
        actor.attemptsTo(
                Ensure.that(TheWebPage.title()).containsIgnoringCase(term)
        );
    }
}
