package com.imdb.pages;

import com.imdb.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Top250MoviesPage {

public Top250MoviesPage(){
    PageFactory.initElements(Driver.getDriver(), this);
}

@FindBy(id="list-view-option-detailed")
    public WebElement detailedView;

}
