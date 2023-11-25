package starter.udea.search;

import net.serenitybdd.screenplay.Actor;
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

    public static Performable clickMissingPassword() {
        return Task.where("{3} click missing password",
                Click.on(SSMUHomePage.MISSING_PASSWORD)
                );
    }

    public static Performable enterEmailMissingPassword(String email) {
        return Task.where("{4} enter missing password",
                Enter.theValue(email)
                        .into(SSMUHomePage.USER)
                )
                .then(
                        Click.on(SSMUHomePage.BUTTON_SEND_CODE)
                );
    }

    public static Performable enterCode(String code) {
        return Task.where("{5} enter missing password code",
                        Enter.theValue(code)
                                .into(SSMUHomePage.CODE)
                )
                .then(
                        Click.on(SSMUHomePage.BUTTON_SEND_CODE)
                );
    }

    public static Performable enterNewPassword(String newPassword) {
        return Task.where("{6} enter new password",
                        Enter.theValue(newPassword)
                                .into(SSMUHomePage.PASSWORD_1)
                                .thenHit(Keys.TAB)
                )
                .then(
                        Enter.theValue(newPassword)
                                .into(SSMUHomePage.PASSWORD_2)
                )
                .then(
                  Click.on(SSMUHomePage.RESET)
                );
    }
}
