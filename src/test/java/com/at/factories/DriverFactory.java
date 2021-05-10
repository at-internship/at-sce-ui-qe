package com.at.factories;

import com.at.utils.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    protected static WebDriver driver;

    public DriverFactory() {
        initialize();
    }
    public void initialize() {
        if (driver == null)
            createNewDriverInstance();
    }
    private void createNewDriverInstance() {
        String browser = new PropertyReader().readProperty("browser");
        if (browser.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }else {
            System.out.println("can't read browser type");
        }

    }
    public WebDriver getDriver() {
        return driver;
    }
    public void destroyDriver() {
        driver.quit();
        driver = null;
    }

}
