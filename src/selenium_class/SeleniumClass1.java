package selenium_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AB73631\\software\\Latest y Deepak\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println("Page openend");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Amandeep");
		
		
		WebElement pass= driver.findElement(By.cssSelector("input[type='password']"));
		pass.sendKeys("Aman");
		WebElement login = driver.findElement(By.cssSelector("input[value ='Log In']"));
		login.click();
		
		

	}

}
