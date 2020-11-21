package com.ryhn.steps.addQuoteSteps;

import com.ryhn.pages.AddQuotePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.MatcherAssert.assertThat;


public class AddQuoteSteps extends ScenarioSteps {

    @Autowired
    AddQuotePage addQuotePage;

    @Given("^user want to open add quote page$")
    public void userWantToOpenAddQuotePage() {
        addQuotePage.openAt("http://gosoft.web.id/wonderfulQuote/");
    }

    @When("^user want to input quote '(.*)'$")
    public void userWantToInputQuote(String quote) {
        addQuotePage.inputQuoteInTxtArea(quote);
    }

    @And("^user want to input author '(.*)'$")
    public void userWantToInputAuthor(String author) {
        addQuotePage.inputAuthorInInput(author);
    }

    @And("^user click dropdown background color$")
    public void userClickDropdownBackgroundColor() {
        addQuotePage.clickDropDown();
    }

    @And("^user want to choose '(.*)' as a background color$")
    public void userWantToChooseAsABackgroundColor(String color) {
        addQuotePage.selectColor(color);
    }

    @And("^user click Add quote button$")
    public void userClickAddQuoteButton() {
        addQuotePage.clickButtonAddQuote();
    }

    @Then("^user can see their name successfully added$")
    public void userCanSeeTheirNameSuccessfullyAdded() {
        assertThat("Nama tidak ditemukan", addQuotePage.isAuthorFound("180709840_AdityaRyoHandoko"));
    }
}
