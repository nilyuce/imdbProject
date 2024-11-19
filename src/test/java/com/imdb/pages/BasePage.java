package com.imdb.pages;

import com.imdb.utilities.Driver;
import org.openqa.selenium.By;
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

    @FindBy(linkText = "Top 250 Movies")
    public WebElement top250MoviesLink;

    public void clickMenuLink(String linkText) {
        try {
            // Find the menu link by its visible text
            WebElement menuLink = Driver.getDriver().findElement(By.xpath("//span[text()='" + linkText + "']"));
            menuLink.click();
        } catch (Exception e) {
            System.out.println("Unable to find or click the link: " + linkText);
            e.printStackTrace();
        }
    }





}
