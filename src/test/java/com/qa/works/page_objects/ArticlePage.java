package com.qa.works.page_objects;

import com.qa.works.drivers.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArticlePage extends DriverFactory {

    @FindBy(css = ".entry-title")
    public WebElement articleHeaderTxt;

    public String getArticleHeader() {
        return articleHeaderTxt.getText();
    }
}
