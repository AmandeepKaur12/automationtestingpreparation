package selenium_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_16_feb_2020 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AB73631\\software\\Latest y Deepak\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	
		driver.manage().window().maximize();
		
		//-- By name:: WebElement Firstname = driver.findElement(By.name("firstname"));	
		WebElement Firstname = driver.findElement(By.id("u_0_m"));
		Firstname.sendKeys("Rohit");
		//WebElement Surname = driver.findElement(By.name("lastname"));
		WebElement Surname = driver.findElement(By.id("u_0_o"));
		Surname.sendKeys("Kaur");
		WebElement Mobile_Number = driver.findElement(By.cssSelector("input#u_0_r"));
		Mobile_Number.sendKeys("9900990012");
		WebElement Password = driver.findElement(By.cssSelector("input[name='reg_passwd__']"));
		Password.sendKeys("Password123");
		WebElement Gender = driver.findElement(By.cssSelector("input[value='2']"));
		Gender.click();
		WebElement SignUp = driver.findElement(By.cssSelector("button[type='submit']"));
		SignUp.click();

	}

}
