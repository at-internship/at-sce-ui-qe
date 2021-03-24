package seleniumcode;

import cucumber.api.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Verify_webpage_behavior_when_valid_email_and_valid_password_is_entered {

    private ChromeDriver driver = Hooks.getDriver();

    @When("^the user enters the web page AT Software Cost Estimation, they must fill in the requested data$")
    public void the_user_enters_the_web_page_AT_Software_Cost_Estimationthey_must_fill_in_the_requested_data() throws Throwable {

        // Email
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[1]/input")).sendKeys("admin@agilethought.com");
        // Password
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[2]/input")).sendKeys("4gil3th0ught");
        Thread.sleep(2000);
        // sign in
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/button")).click();
        Thread.sleep(2000);
    }
}
