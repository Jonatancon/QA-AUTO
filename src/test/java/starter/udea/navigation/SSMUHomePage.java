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
}
