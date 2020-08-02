package firstAutomationTry;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zlatomir\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();       
		String loginUrl = "https://www.abv.bg/";
		driver.get(loginUrl);
		//driver.manage().window().maximize();
		String password = "test12345";
		driver.findElement(By.id("password")).sendKeys(password);
		WebElement passwordField = driver.findElement(By.cssSelector("input"));
		String typeField = driver.findElement(By.id("password")).getAttribute("type");
		driver.close();
		if(typeField.equals("password"))
		{
			System.out.println("Passed!");
		}
		else
		{
			System.out.println("Failed!");
		}
	}
}
