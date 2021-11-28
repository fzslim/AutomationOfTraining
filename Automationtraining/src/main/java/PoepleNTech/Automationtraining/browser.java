package PoepleNTech.Automationtraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser {
static WebDriver driver; 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//how to open the browser , web driver is an interface
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pipi123\\eclipse-workspace\\Automationtraining\\src\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().to("https://www.amazon.com");
	driver.manage().window().maximize();
	Thread.sleep(6000);
	driver.navigate().refresh();
	Thread.sleep(6000);
	driver.navigate().back();
	Thread.sleep(6000);
	driver.navigate().forward();
	String windowhandle= driver.getWindowHandle();
	System.out.println(windowhandle);
	String urlofbrowser= driver.getCurrentUrl();
	System.out.println(urlofbrowser);
	driver.close();
	
	}

}
