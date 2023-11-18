package starter.amazon.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import starter.amazon.navigation.AmazonHomePage;
import starter.amazon.navigation.NavigateToAmazon;
import starter.amazon.search.LookinformationAmazon;
import starter.google.navigation.NavigateToGoogle;
import starter.google.search.LookInformationGoogle;

public class AddItemStepDefinition {

    @Given("{actor} wants to add a television to the shopping cart")
    public void searchItem(Actor actor) {
        actor.wasAbleTo(NavigateToAmazon.theSearchHomePage());
    }

    @When("{actor} search for {string} and add it to the shopping cart")
    public void searchAndAddItem(Actor actor, String item) {
        actor.attemptsTo(
                LookinformationAmazon.about(item)
        );

        actor.attemptsTo(
                LookinformationAmazon.clickElement()
        );

        actor.attemptsTo(
                LookinformationAmazon.addToShoppingCart()
        );
    }
    @Then("{actor} should see a {string} in the shopping cart")
    public void addShoppingCart(Actor actor, String number) {
        actor.attemptsTo(
                Ensure.that(AmazonHomePage.COUNT_CART).hasText(number)
        );
    }
}
