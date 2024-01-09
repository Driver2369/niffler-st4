package guru.qa.niffler.pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {

    private final SelenideElement spendingsTable = $(".spendings-table");
    private final ElementsCollection spendingsRows = spendingsTable.$$("tbody tr");
    private final SelenideElement deleteButton = $$(".spendings__table-controls button").findBy(text("Delete selected"));
    public MainPage selectSpendingWithDescription(String description) {
        spendingsRows.findBy(text(description)).$("td").scrollIntoView(true).click();

        return this;
    }

    public MainPage clickDeleteSelectedButton() {
        deleteButton.click();

        return this;
    }

    public MainPage spendingRowsCountShouldBeEqualTo(int size) {
        spendingsRows.shouldHave(CollectionCondition.size(size));

        return this;

    }


}
