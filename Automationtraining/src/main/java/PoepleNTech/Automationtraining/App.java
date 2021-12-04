package PoepleNTech.Automationtraining;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;

        public class Ilocator {
        	public static WebDriver driver;
        	public static void main(String[] args) {
        		// TODO Auto-generated method stub
        		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pipi123\\eclipse-workspace\\Automationtraining\\src\\drivers\\chromedriver.exe");
        	driver=new ChromeDriver();
        	driver.navigate().to("https://www.amazon.com");
        	driver.manage().window().maximize();
        	Thread.sleep(6000);
        	webElement SerachIcon=driver.findElement(By.id("id=\"nav-search-submit-button\"))
        	}
    }
}
