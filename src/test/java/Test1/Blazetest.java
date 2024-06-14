package Test1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page1.Blazepage;

public class Blazetest {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
@BeforeMethod
public void url()
{
	driver.get("https://blazedemo.com/register");
}
@Test
public void register()
{
	Blazepage ob=new Blazepage(driver);
	ob.setvalues("Gopika", "fsdf", "dfd@gmail.com", "dsfsd", "dsfsd");
	ob.register();
	ob.setvalues("abc@gmail.com", "fswr");
	ob.login();
	
	
}



	

}
