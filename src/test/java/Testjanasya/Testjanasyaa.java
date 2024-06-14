package Testjanasya;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pagejanasya.Pagejanasyaa;

public class Testjanasyaa {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://janasya.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void test1()
	{
		Pagejanasyaa ob=new Pagejanasyaa(driver);
		ob.newarrvial();
		ob.logopresent();
		ob.itemperpage();
		ob.category();
		ob.alllinks();
		ob.menus();
		ob.wishlist();
		ob.addcart();
		ob.viewcart();
		ob.continueshop();
		ob.ethnics();
	}
		
	}


