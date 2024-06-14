package page1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blazepage {
	ChromeDriver driver;
	By blazename=By.id("name");
	By blazecomp=By.id("company");
	By blazeemail=By.id("email");
	By blazepassword=By.id("password");
	By blazeconfirm=By.id("password-confirm");
	By blazeregister=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
	
	//login
	By blazerlogin=By.xpath("//*[@id=\"app-navbar-collapse\"]/ul[2]/li[1]/a");
	By blazeremailaddress=By.id("email");
	By blazerpasswords=By.id("password");
	
	public Blazepage (ChromeDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String Name, String company ,String email, String password, String passwordconfirm)
	{
		
		driver.findElement(blazename).sendKeys(Name);
		driver.findElement(blazecomp).sendKeys(company);
		driver.findElement(blazeemail).sendKeys(email);
		driver.findElement(blazepassword).sendKeys(password);
		driver.findElement(blazeconfirm).sendKeys(passwordconfirm);
		
		


}
	public void setvalues(String emailaddress,String passwords)
	{
		//login
		driver.findElement(blazeremailaddress).sendKeys(emailaddress);
		driver.findElement(blazerpasswords).sendKeys(passwords);
	}
public void register()
{
	driver.findElement(blazeregister).click();
	driver.navigate().to("https://blazedemo.com/login");
}
	public void login()
	{
		driver.findElement(blazerlogin).click();
	}
	
}
	
	
	
