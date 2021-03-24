package seleniumcode;

import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Email_and_password_are_left_blank {

    private ChromeDriver driver = Hooks.getDriver();

    @When("^message error data was not entered$")
    public void message_error_data_was_not_entered() throws Throwable {
        // Email
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[1]/input")).sendKeys("");
        // Password
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[2]/input")).sendKeys("");
        Thread.sleep(1000);
        // sign in
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/button")).click();
        Thread.sleep(2500);
    }
}
