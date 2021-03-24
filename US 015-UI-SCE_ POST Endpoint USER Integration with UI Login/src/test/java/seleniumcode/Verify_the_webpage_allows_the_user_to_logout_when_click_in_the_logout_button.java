package seleniumcode;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_the_webpage_allows_the_user_to_logout_when_click_in_the_logout_button {

    private ChromeDriver driver = Hooks.getDriver();

    @When("^the user log in successfully in the web page AT Software Cost Estimation$")
    public void the_user_log_in_successfully_in_the_web_page_AT_Software_Cost_Estimation() throws Throwable {

        // Email
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[1]/input")).sendKeys("admin@agilethought.com");
        // Password
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[2]/input")).sendKeys("4gil3th0ught");
        Thread.sleep(1000);
        // sign in
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/button")).click();
        Thread.sleep(1000);
    }

    @Then("^the user wants to exit the page by clicking on the logout button$")
    public void the_user_wants_to_exit_the_page_by_clicking_on_the_logout_button() throws Throwable {

        driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul[2]/li[2]/a/img")).click();
        Thread.sleep(2000);


    }

}
