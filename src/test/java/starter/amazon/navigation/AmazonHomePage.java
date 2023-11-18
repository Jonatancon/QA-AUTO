package starter.amazon.navigation;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@DefaultUrl("https://www.amazon.com")
public class AmazonHomePage extends PageObject {

    public static final Target SEARCH_ITEM = Target.the("search field")
            .locatedBy("//*[@id='twotabsearchtextbox']");

    public static final Target LINK_ITEM = Target.the("a link")
            .locatedByFirstMatching("//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a");

    public static final Target ADD_CART = Target.the("a button for add to cart")
            .locatedBy("#add-to-cart-button");
    public static final Target COUNT_CART = Target.the("Count for cart")
            .locatedBy("#nav-cart-count");
}
