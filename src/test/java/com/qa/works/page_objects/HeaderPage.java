package com.qa.works.page_objects;

import com.qa.works.drivers.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HeaderPage extends DriverFactory {

    @FindBy(css = "#menu-qaworks-menu-general .menu-text")
    private List<WebElement> navigationLinks;

    public boolean isOnHomePage() {
        return getDriver().getCurrentUrl().endsWith(".qaworks.com/");
    }

    public void navigateTo(String link) {
        for (WebElement navigationLink : navigationLinks) {
            if (navigationLink.getText().equalsIgnoreCase(link)) {
                navigationLink.click();
                break;
            }
        }
    }
}
