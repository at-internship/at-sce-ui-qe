package seleniumcode;

import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class invalid_email_and_invalid_password_is_entered {

    private ChromeDriver driver = Hooks.getDriver();

    @When("^the user tries to login$")
    public void the_user_tries_to_login() throws Throwable {
        // Email
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[1]/input")).sendKeys("admin@._agilethought.com");
        // Password
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[2]/input")).sendKeys("123");
        Thread.sleep(2000);
        // sign in
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/button")).click();
        Thread.sleep(2000);
    }
}