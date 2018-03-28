package com.qa.works.page_objects;

import com.qa.works.drivers.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;

public class ContactPage extends DriverFactory {

    @FindBy(css = "#qaworks-contact-us .wpcf7-form-control")
    private List<WebElement> formWebElements;

    @FindBy(id = "contact-us-send")
    private WebElement submitBtn;


    @FindBy(css = ".fusion-slider-loading")
    private WebElement loader;

    @FindBy(css = ".wpcf7-mail-sent-ng")
    private WebElement alertMsg;


    public void submitForm() {
        submitBtn.click();
    }

    public boolean validateIsMessageSent() {
        new WebDriverWait(getDriver(), 30).until(ExpectedConditions.invisibilityOf(loader));
        return alertMsg.isDisplayed();
    }

    public void enterFormDetails(Map<String, String> formDetails) {
        for (Object item : formDetails.entrySet()) {
            Map.Entry entry = (Map.Entry) item;
            String key = entry.getKey().toString();
            for (WebElement formWebElement : formWebElements) {
                if (formWebElement.getAttribute("name").contains(key)) {
                    formWebElement.sendKeys(formDetails.get(key));
                    break;
                }
            }
        }
    }
}
