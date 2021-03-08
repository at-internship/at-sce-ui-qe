package seleniumcode;

import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Date_birth_is_not_selected {

    private ChromeDriver driver = Hooks.getDriver();

    @When("^Error message when the date birth is not selected$")
    public void Error_message_when_the_date_birth_is_not_selected() throws Throwable {
        // FullName
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Edwin");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Cruz");
        Thread.sleep(1000);
        // Address
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Calle Pompeya 42");
        // Email address
        driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("Edcruz@gmail.com");
        Thread.sleep(1000);
        // phone
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("9963254178");
        // Gender
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]")).click();
        Thread.sleep(1000);
        // Hobbies
        driver.findElement(By.xpath("//*[@id=\"checkbox3\"]")).click();
        Thread.sleep(1000);
        // languages
        driver.findElement(By.xpath("//*[@id=\"msdd\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[35]/a")).click();
        Thread.sleep(1000);
        // skill
        Select skill = new Select(driver.findElement(By.xpath("//*[@id=\"Skills\"]")));
        skill.selectByVisibleText("CSS");
        Thread.sleep(1000);
        // Country
        Select country = new Select(driver.findElement(By.xpath("//*[@id=\"countries\"]")));
        country.selectByVisibleText("Italy");
        Thread.sleep(1000);
        // select country
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Hong Kong");
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
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
        driver.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys("@Mex_55@");
        // confirm password
        driver.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys("@Mex_55@");
        Thread.sleep(1000);
        // photo
        driver.findElement(By.id("imagesrc")).sendKeys("C:\\Users\\sulis\\Downloads\\fondo.jpg");
        // button submit
        driver.findElement(By.xpath("//*[@id=\"submitbtn\"]")).click();
        Thread.sleep(1500);
    }
}