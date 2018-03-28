package com.qa.works.page_objects;

import com.qa.works.drivers.DriverFactory;
import com.qa.works.utils.Helpers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class InsightsPage extends DriverFactory {

    @FindBy(css = ".blog-shortcode-post-title.entry-title>a")
    private List<WebElement> insightsList;

    public static String selectedInsights;

    public void selectAnyInsights() {
        int randomNumber = new Helpers().randomNumber(insightsList.size());
        selectedInsights = insightsList.get(randomNumber).getText();
        insightsList.get(randomNumber).click();
    }
}
