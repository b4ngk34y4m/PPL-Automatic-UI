package com.ryhn.pages;

import io.vavr.collection.Array;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AddQuotePage extends PageObject {


    @FindBy(xpath = "//textarea[contains(@placeholder, 'input quotes here')]")
    private WebElementFacade txtAreaQuote;

    @FindBy(xpath = "//input[contains(@placeholder, 'input author')]")
    private WebElementFacade inputAuthor;

    @FindBy(xpath = "//select")
    private WebElementFacade dropDownColor;

    @FindBy(xpath = "//button[contains(text(),'Add Quote')]")
    private WebElementFacade buttonAddQuote;

    @FindBy(xpath = "//div//p[contains(text(), '')]")
    private List<WebElementFacade> getStringAuthor;

    public void inputQuoteInTxtArea(String quote) {
        txtAreaQuote.type(quote);
    }

    public void inputAuthorInInput(String author) {
        inputAuthor.type(author);
    }

    public void clickDropDown() {
        dropDownColor.click();
    }

    public void selectColor(String color) {
        dropDownColor.selectByVisibleText(color);
    }

    public void clickButtonAddQuote() {
        buttonAddQuote.click();
    }

    public boolean isAuthorFound(String author) {
        return getStringAuthor.stream().anyMatch(x -> x.getText().equals(author));
    }
}
