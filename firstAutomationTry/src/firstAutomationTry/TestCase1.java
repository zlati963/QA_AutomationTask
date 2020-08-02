package firstAutomationTry;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCase1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zlatomir\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String loginUrl = "https://www.abv.bg/";
		driver.get(loginUrl);
		driver.manage().window().maximize();
		String username = "test_ep1";
		String password = "test12345";
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("loginBut")).click();
		String currentUrl = driver.getCurrentUrl();
		String successUrl = "https://nm60.abv.bg/Mail.html";
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
