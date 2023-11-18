package starter.google.search;

import net.serenitybdd.screenplay.targets.Target;

public class SearchForm {
    public static final Target SEARCH_FIELD = Target.the("search field")
            .locatedBy("#APjFqb");

    public static final Target AMAZON = Target.the("link amazon")
            .locatedBy("#rso");
}
