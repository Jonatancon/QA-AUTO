package starter.google.navigation;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateToGoogle {

    public static Performable theSearchHomePage() {
        return Task.where("{0} opens the google home page",
                Open.browserOn().the(GoogleHomePage.class));
    }
}
