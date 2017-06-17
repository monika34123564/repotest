import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:/LEADS_java/testing/New folder/geckodriver.exe");
		WebDriver frdriver= new FirefoxDriver();
		//WebDriver chdriver= new ChromeDriver();
		frdriver.get("http://newtours.demoaut.com/");
		
		
		//System.setProperty("webdriver.chrome.driver", "E:/LEADS_java/testing/New folder/geckodriver.exe");
		
		//WebDriver chdriver= new ChromeDriver();
		//frdriver.get("http://newtours.demoaut.com/");

		
		//frdriver.get("http://newtours.demoaut.com/");
		//frdriver.findElement(By.xpath("")).sendKeys("demo");
		
		//frdriver.get("http://newtours.demoaut.com/");
	    //frdriver.findElement(By.xpath("")).click("");
	}

}
