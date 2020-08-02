package firstAutomationTry;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zlatomir\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();       
		String loginUrl = "https://nm60.abv.bg/Mail.html";
		driver.get(loginUrl);
		//driver.manage().window().maximize();
		Thread.sleep(7000);
		driver.findElement(By.className("abv-button")).click();
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
