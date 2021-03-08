package seleniumcode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class The_data_is_invalid {
    private ChromeDriver driver = Hooks.getDriver();

    @Given("^Error message when the data is invalid format$")
    public void Error_message_when_the_data_is_invalid_format() throws Throwable {

            // FullName
            driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("");
            driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("");
            Thread.sleep(1000);
            // Address
            driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("");
            // Email address
            driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("");
            Thread.sleep(1000);
            // phone
            driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("");
            // Gender
            driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]"));
            Thread.sleep(1000);
            // Hobbies
            driver.findElement(By.xpath("//*[@id=\"checkbox1\"]"));
            driver.findElement(By.xpath("//*[@id=\"checkbox2\"]"));
            Thread.sleep(1000);
            // languages
            driver.findElement(By.xpath("//*[@id=\"msdd\"]"));
            Thread.sleep(1000);
            // skill
            driver.findElement(By.xpath("//*[@id=\"Skills\"]"));
            Thread.sleep(1000);
            // Country
            driver.findElement(By.xpath("//*[@id=\"countries\"]"));
            Thread.sleep(1000);
            // select country
            driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
            Thread.sleep(1000);
            // Date of Birth
            // year
            driver.findElement(By.xpath("//*[@id=\"yearbox\"]/option[1]")).click();
            Thread.sleep(1000);
            //month
            driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select/option[1]")).click();
            Thread.sleep(1000);
            // day
            driver.findElement(By.xpath("//*[@id=\"daybox\"]/option[1]")).click();
            Thread.sleep(1000);
            // password
            driver.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys("");
            // confirm password
            driver.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys("");
            Thread.sleep(1000);
            // photo
            // button submit
            driver.findElement(By.xpath("//*[@id=\"submitbtn\"]")).click();
            Thread.sleep(1500);
        }
    }



