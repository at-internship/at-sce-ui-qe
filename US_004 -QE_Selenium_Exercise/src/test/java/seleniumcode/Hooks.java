package seleniumcode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private static ChromeDriver driver;
    private static  int numberofcase = 0;


    @Before
    public void  setUp(){
        numberofcase ++;
        System.out.println("Scenario number " + numberofcase + " is running");
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe/");
        driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();

    }
    @After
    public void tearDown(){
        System.out.println("Scenario number " + numberofcase + " was executed successful");
        driver.quit();

    }

    public static ChromeDriver getDriver(){

    return driver;

    }

}
