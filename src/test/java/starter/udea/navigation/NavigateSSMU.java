package starter.udea.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateSSMU {
    public static Performable theSearchHomePage() {
        return Task.where("{0} open the SSMU home page",
                Open.browserOn().the(SSMUHomePage.class));
    }
}
