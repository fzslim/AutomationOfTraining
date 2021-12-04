package PoepleNTech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pipi123\\eclipse-workspace\\Automationtraining\\src\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement CreateAnAccount=driver.findElement(By.xpath("//*[text()='Create new account']"));
		CreateAnAccount.click();
		Thread.sleep(6000);
		WebElement MonthOfBirth=driver.findElement(By.name("birthday_month"));
		Select ob=new Select(MonthOfBirth);
		ob.selectByValue("1");
		WebElement BirthDay=driver.findElement(By.name("birthday_day"));
		Select birth=new Select(BirthDay);
		birth.selectByVisibleText("6");
		
		
	}

	private static WebElement Element(By name) {
		// TODO Auto-generated method stub
		return null;
	}

}
