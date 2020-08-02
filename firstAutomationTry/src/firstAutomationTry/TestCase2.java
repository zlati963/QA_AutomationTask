package firstAutomationTry;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestCase2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zlatomir\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String loginUrl = "https://www.abv.bg/";
		driver.get(loginUrl);
		driver.manage().window().maximize();
		driver.findElement(By.id("loginBut")).click();
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
