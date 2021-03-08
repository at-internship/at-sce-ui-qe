package seleniumcode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Test {

    private ChromeDriver driver = Hooks.getDriver();

    @Given("^The user should open the webpage Automation Demo Site$")
    public void the_user_should_open_the_webpage_Automation_Demo_Site() throws Throwable {

        String TitleHomePage = "Register";
        Assert.assertEquals(TitleHomePage, driver.getTitle());
    }

    @When("^the user enters the web page, they must fill in the requested data$")
    public void the_user_enters_the_web_page_they_must_fill_in_the_requested_data() throws Throwable {

        // FullName
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Ulises");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Santiago");
        Thread.sleep(1000);
        // Address
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("fake street 123");
        // Email address
        driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("ulises1@gmail.com");
        Thread.sleep(1000);
        // phone
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("1523647891");
        // Gender
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]")).click();
        Thread.sleep(1000);
        // Hobbies
        driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
        Thread.sleep(1000);
        // languages
        driver.findElement(By.xpath("//*[@id=\"msdd\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[35]/a")).click();
        Thread.sleep(1000);
        // skill
        Select skill = new Select(driver.findElement(By.xpath("//*[@id=\"Skills\"]")));
        skill.selectByVisibleText("Client Server");
        Thread.sleep(1000);
        // Country
        Select country = new Select(driver.findElement(By.xpath("//*[@id=\"countries\"]")));
        country.selectByVisibleText("Mexico");
        Thread.sleep(1000);
        // select country
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("New Zealand");
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        // Date of Birth
        // year
        WebElement year = driver.findElement(By.xpath("//*[@id=\"yearbox\"]"));
        Select año = new Select(year);
        año.selectByValue("1999");
        Thread.sleep(1000);
        //month
        WebElement month = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
        Select mes = new Select(month);
        mes.selectByValue("June");
        Thread.sleep(1000);
        // day
        WebElement day = driver.findElement(By.xpath("//*[@id=\"daybox\"]"));
        Select dia = new Select(day);
        dia.selectByValue("6");
        Thread.sleep(1000);
        // password
        driver.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys("@Gatos_123@");
        // confirm password
        driver.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys("@Gatos_123@");
        Thread.sleep(1000);
        // photo
        driver.findElement(By.id("imagesrc")).sendKeys("C:\\Users\\sulis\\Downloads\\fondo.jpg");
    }
    @Then("^Once finished, the submit button will be clicked to send the data and the browser will be closed$")
    public void once_finished_the_submit_button_will_be_clicked_to_send_the_data_and_the_browser_will_be_closed() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"submitbtn\"]")).click();
        Thread.sleep(1500);
    }
}

