package firstAutomationTry;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zlatomir\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions enter = new Actions(driver);        
		String loginUrl = "https://www.abv.bg/";
		driver.get(loginUrl);
		driver.manage().window().maximize();
		String username = "test_ep1";
		String password = "Test12345";
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		enter.sendKeys(Keys.ENTER);
		String currentUrl = driver.getCurrentUrl();
		String successUrl = "https://www.abv.bg/";
		driver.close();
		if(currentUrl.equalsIgnoreCase(successUrl))
		{
			System.out.println("Passed!");
		}
		else
		{
			System.out.println("Failed!");
		}
	}
}
