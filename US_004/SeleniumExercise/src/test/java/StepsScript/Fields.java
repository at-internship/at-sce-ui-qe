	package StepsScript;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.When;
	
	public class Fields {
		static WebDriver driver;
		
		@Given("user open the browser on the page")
		
	public void user_open_the_browser() throws InterruptedException {
			
		System.out.println("User is on page");
		Thread.sleep(2500);
	    String projectPath = System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/Drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.navigate().to("http://demo.automationtesting.in/Register.html");
	}
	
	
	public void fieldAll(String name,String lastName,String addres,String email,String phone,String gender,String hobbies, String skill,String c,String y,String m,String d,String password, String confirmPassword) throws InterruptedException {
	    
	 
		driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys(name);
		driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]")).sendKeys(lastName);
		driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")).sendKeys(addres);
		driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys(email);
		driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")).sendKeys(phone);
			
		
				
		if(gender.equals("M")) {
			driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[1]/input[1]")).click();
		}
		if(gender.equals("F")) {
			driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")).click();
		}
		
		WebElement skills = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select sel = new Select(skills);
		sel.selectByValue(skill);
		
		if(hobbies.equals("Cricket")) {
			driver.findElement(By.id("checkbox1")).click();
		}

		if(hobbies.equals("Movies")) {
			driver.findElement(By.id("checkbox2")).click();
		}
		if(hobbies.equals("Hoockey")) {
			driver.findElement(By.id("checkbox3")).click();
		}
				
		WebElement country = driver.findElement(By.xpath("//select[@id='countries']"));
		Select selC = new Select(country);
		selC.selectByValue(c);
		
		WebElement year = driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select selY = new Select(year);
		selY.selectByValue(y);
		
		WebElement month = driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[11]/div[2]/select[1]"));
		Select selM = new Select(month);
		selM.selectByValue(m);
		
		WebElement day = driver.findElement(By.xpath("//select[@id='daybox']"));
		Select selD = new Select(day);
		selD.selectByValue(d);
		
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys(confirmPassword);
		
		driver.findElement(By.id("imagesrc")).sendKeys("C:/Users/Usser/OneDrive - AgileThought/Pictures/img.png");
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"msdd\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[1]/a")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"section\"]/div/div")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[2]")).click();
				
	}
	public void EndStep() throws InterruptedException {
		 driver.findElement(By.xpath("//*[@id=\"submitbtn\"]")).click();
			 Thread.sleep(2500);
			 driver.close();
		}
		
		
	}
