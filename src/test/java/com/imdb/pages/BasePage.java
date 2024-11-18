package com.imdb.pages;

import com.imdb.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@data-testid='accept-button']")
    public WebElement loginCookieAccept;

    @FindBy(id = "imdbHeader-navDrawerOpen")
    public WebElement menuIcon;





}
