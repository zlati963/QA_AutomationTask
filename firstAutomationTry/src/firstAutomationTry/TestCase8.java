package firstAutomationTry;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zlatomir\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String loginUrl = "https://www.abv.bg/";
		driver.get(loginUrl);
		//driver.manage().window().maximize();
		
		String username = "test_ep1";
		String password = "test12345";
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("loginBut")).click();
		Thread.sleep(3000);
		
		String currentUrl = driver.getCurrentUrl();
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Zlatomir\\Selenium\\geckodriver.exe");
		WebDriver driver2 = new FirefoxDriver();
		
		String loginUrl2 = "https://www.abv.bg/";
		driver2.get(loginUrl2);
		
		String username2 = "test_ep1";
		String password2 = "test12345";
		
		driver2.findElement(By.id("username")).sendKeys(username2);
		driver2.findElement(By.id("password")).sendKeys(password2);
		driver2.findElement(By.id("loginBut")).click();
		Thread.sleep(5000);
		String currentUrl2 = driver2.getCurrentUrl();
		driver.close();
		driver2.close();
		
		String successUrl = "https://nm60.abv.bg/Mail.html";
		
		if(currentUrl.equalsIgnoreCase(successUrl)&&currentUrl2.equalsIgnoreCase(successUrl))
		{
			System.out.println("Passed!");
		}
		else
		{
			System.out.println("Failed!");
		}

	}
}
