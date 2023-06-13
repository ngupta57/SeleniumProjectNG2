package SeleniumWorkday16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestLogin {

	public static void main(String[] args) throws InterruptedException {
		// 
		
		//SETUP JAVA
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumPracNGMAY23\\workspace\\SeleniumProjectNG2\\Drivers\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		//for syncronization added wait
		Thread.sleep(4000);
		
		//find by Name
		driver.findElement(By.name("username")).sendKeys("Admin");
		//find element by xpath		
		driver.findElement(By.xpath("//input[@placeholder='Password'][@name='password']")).sendKeys("admin123");
		//find element by cssSelector  -TAG & ATTRIBUTE
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		//Validate title of the page is as expected
		 String expTitle= "OrangeHRM";
		 String actTitle= driver.getTitle();
		 if (expTitle.equalsIgnoreCase(actTitle)) {
			 System.out.println("The Title of the page is as expected: "+ actTitle);
		 } else
			 System.out.println("The Title of the page is not as expected: expected title:" + expTitle + "Actual Title : " + actTitle);
		 
		 //close current  browser
		 System.out.println("Closing Browser and then quitting");
		 driver.close();
		 driver.quit();
		
		

}}

