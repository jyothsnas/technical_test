package com.qa.works;

import com.qa.works.drivers.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    private DriverFactory driverFactory;

    public Hooks(DriverFactory diDriverFactory) {
        this.driverFactory = diDriverFactory;
    }

    @Before
    public void setUp() {
        driverFactory.openBrowser();
        driverFactory
                .maxBrowser()
                .applyWaits();
    }

    @After
    public void tearDown() {
        driverFactory.closeBrowser();
    }

}
