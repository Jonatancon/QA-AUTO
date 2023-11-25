package starter.udea.navigation;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://localhost:3000/")
public class SSMUHomePage extends PageObject {

    public static final Target USER = Target.the("Field User")
            .locatedBy("//*[@id='email']");
    public static final Target PASSWORD = Target.the("Field User")
            .locatedBy("//*[@id='password']");

    public static final Target BUTTON_LOGIN = Target.the("Field User")
            .locatedBy("//*[@id='__next']/div/main/main/div/form/button");

    public static final Target ROL = Target.the("Field User")
            .locatedBy("//*[@id='__next']/div/div/div/div/ul[1]/li/div/div[2]/span");


    public static final Target MESSAGE = Target.the("Message")
            .locatedBy("//*[@id='modal-modal-title']");

    public static final Target LOG_OUT = Target.the("Message")
            .locatedBy("//*[@id='__next']/div/div/div/div/ul[2]/li[4]/div");

    public static final Target HOME_PAGE = Target.the("Message")
            .locatedBy("//*[@id='__next']/div/div/div/div/ul[2]/li[4]/div");
    public static final Target MISSING_PASSWORD = Target.the("Missing password")
            .locatedBy("//*[@id='__next']/div/main/main/div/div/div/a");
    public static final Target BUTTON_SEND_CODE = Target.the("Send Code")
            .locatedBy("//*[@id='__next']/div/main/div/div/form/div[2]/button[2]");
    public static final Target CODE = Target.the("Send Code")
            .locatedBy("//*[@id='codigo']");
    public static final Target PASSWORD_1 = Target.the("Enter password 1")
            .locatedBy("//*[@id='Nuevo contrasena']");

    public static final Target PASSWORD_2 = Target.the("Enter password 2")
            .locatedBy("//*[@id='Vuelva a escribir la contrasena']");
    public static final Target RESET = Target.the("Enter password 2")
            .locatedBy("//*[@id='__next']/div/main/div[2]/div/form/div[3]/div/button[2]");;
}
