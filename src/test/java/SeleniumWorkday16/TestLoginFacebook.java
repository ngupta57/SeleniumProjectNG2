package SeleniumWorkday16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// Steps:
//URL: hTTPS://www.facebook.com
//Enter user name & Password
//Click log in

public class TestLoginFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		//find element by xpath & enter value for userid
		driver.findElement(By.xpath("//input[@id='email' or @name= 'email']")).sendKeys("narinder.gupta@gmail.com");
		//find element by xpath Tag Attribute 1 and 2
		driver.findElement(By.xpath("//input[@name='pass' and @id= 'pass']")).sendKeys("Americaisbest23?");
		//click login button
		//find element by cssSelector tag& attribute
		driver.findElement(By.cssSelector("button[name=login]")).click();
		
		
	}

}
