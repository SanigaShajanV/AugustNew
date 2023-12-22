package august;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo {
	WebDriver driver;
	String url="https://www.google.com/";
	@BeforeTest
	public void setup() {
		
		driver=new ChromeDriver();
		
	}
	@Test
	public void test() {
		driver.get(url);
		
	}

}
