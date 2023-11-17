package starter.amazon.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateToAmazon {

    public static Performable theSearchHomePage() {
        return Task.where("{0} open the amazon home page",
                Open.browserOn().the(AmazonHomePage.class));
    }
}
