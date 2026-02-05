package com.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.driver.DriverFactory;
import com.utils.PropertyUtils;

public class BaseTest {

    protected WebDriver driver;

    // Launch browser and open application
    @BeforeClass
    public void setup() throws InterruptedException {
        String browser = PropertyUtils.getProperty("browser");
        driver = DriverFactory.initDriver(browser);
        driver.get(PropertyUtils.getProperty("baseUrl"));
        Thread.sleep(3000);
    }

    // Close browser
    @AfterClass
    public void tearDown() {
    	if(driver != null) {
    		driver.quit();
    	}
    }
}
