package starter.amazon.search;

import net.serenitybdd.core.pages.ClickStrategy;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;
import starter.amazon.navigation.AmazonHomePage;

public class LookinformationAmazon {
    public static Performable about(String searchTerm) {
        return Task.where("{0} search for '"+searchTerm+"'",
                Enter.theValue(searchTerm)
                        .into(AmazonHomePage.SEARCH_ITEM)
                        .thenHit(Keys.ENTER)
        );
    }

    public static Performable clickElement() {
        return Task.where("{1} click first item",
                Click.on(AmazonHomePage.LINK_ITEM)
        );
    }

    public static Performable addToShoppingCart() {
        return Task.where("{2} click add to cart",
                Click.on(AmazonHomePage.ADD_CART)
                        .withStrategy(ClickStrategy.WAIT_UNTIL_PRESENT)
        );
    }
}
