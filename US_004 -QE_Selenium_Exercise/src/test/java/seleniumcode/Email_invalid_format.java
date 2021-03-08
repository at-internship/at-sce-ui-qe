package seleniumcode;

import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Email_invalid_format {

    private ChromeDriver driver = Hooks.getDriver();

    @When("^Error message when the email invalid format$")
    public void Error_message_when_the_email_invalid_format() throws Throwable {
        // FullName
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Luis");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("casas");
        Thread.sleep(1000);
        // Address
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("1 de Septiembre 903");
        // Email address
        driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("casas23@_.gmail.com");
        Thread.sleep(1000);
        // phone
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("5521364587");
        // Gender
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]")).click();
        Thread.sleep(1000);
        // Hobbies
        driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
        Thread.sleep(1000);
        // languages
        driver.findElement(By.xpath("//*[@id=\"msdd\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a")).click();
        Thread.sleep(1000);
        // skill
        Select skill = new Select(driver.findElement(By.xpath("//*[@id=\"Skills\"]")));
        skill.selectByVisibleText("C");
        Thread.sleep(1000);
        // Country
        Select country = new Select(driver.findElement(By.xpath("//*[@id=\"countries\"]")));
        country.selectByVisibleText("Colombia");
        Thread.sleep(1000);
        // select country
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("United States of America");
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        // Date of Birth
        // year
        WebElement year = driver.findElement(By.xpath("//*[@id=\"yearbox\"]"));
        Select año = new Select(year);
        año.selectByValue("1990");
        Thread.sleep(1000);
        //month
        WebElement month = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
        Select mes = new Select(month);
        mes.selectByValue("February");
        Thread.sleep(1000);
        // day
        WebElement day = driver.findElement(By.xpath("//*[@id=\"daybox\"]"));
        Select dia = new Select(day);
        dia.selectByValue("23");
        Thread.sleep(1000);
        // password
        driver.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys("@Colombia_22@");
        // confirm password
        driver.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys("@Colombia_22@");
        Thread.sleep(1000);
        // photo
        driver.findElement(By.id("imagesrc")).sendKeys("C:\\Users\\sulis\\Downloads\\fondo.jpg");
        // button submit
        driver.findElement(By.xpath("//*[@id=\"submitbtn\"]")).click();
        Thread.sleep(1500);


    }
}
