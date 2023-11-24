package starter.udea.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import starter.udea.navigation.SSMUHomePage;

public class TaskSSMU {

    public static Performable enterUser(String user) {
        return Task.where("{0} enter user '"+user+"'",
                Enter.theValue(user)
                        .into(SSMUHomePage.USER)
                );
    }

    public static Performable enterPassword(String password) {
        return Task.where("{1} enter password '"+password+"'",
                Enter.theValue(password)
                        .into(SSMUHomePage.PASSWORD)
                        .thenHit(Keys.ENTER)
                );
    }

    public static Performable logOut() {
        return Task.where("{2} click log out",
                Click.on(SSMUHomePage.LOG_OUT)
        );
    }

}
