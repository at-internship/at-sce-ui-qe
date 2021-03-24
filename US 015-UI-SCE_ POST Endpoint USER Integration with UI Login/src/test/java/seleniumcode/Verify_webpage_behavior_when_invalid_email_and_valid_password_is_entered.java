package seleniumcode;

import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_webpage_behavior_when_invalid_email_and_valid_password_is_entered {


    private ChromeDriver driver = Hooks.getDriver();

    @When("^Error message when the email invalid format$")
    public void error_message_when_the_email_invalid_format() throws Throwable {
        // Email
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[1]/input")).sendKeys(" admin@._agilethought.com");
        // Password
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[2]/input")).sendKeys("4gil3th0ught");
        Thread.sleep(2000);
        // sign in
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/button")).click();
        Thread.sleep(2000);
    }
}
