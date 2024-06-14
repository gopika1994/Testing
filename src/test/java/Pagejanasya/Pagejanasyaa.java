package Pagejanasya;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Pagejanasyaa {
	ChromeDriver driver;
	By janasyanewarraival= By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul/li[1]/a/span");
	By janasyalogo=By.xpath("//*[@id=\"shopify-section-sections--16349892411562__0551e2c3-4916-467e-a6e9-b0d8594a3ff3\"]/header/div/div/div[2]/div/div/div/a/img");
	By item=By.xpath("/html/body/div[2]/main/div[2]/div[1]/div/div[1]/div[2]/div/toolbar-item/div[2]/div[3]/div[1]/div/div/span[2]");
	By num=By.xpath("//*[@id=\"CollectionProductGrid\"]/div/toolbar-item/div[2]/div[3]/div[1]/div/ul/li[2]/span");
	By categories=By.xpath("//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[1]/h3");
	
	By kurtha=By.xpath("//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[2]/div/ul/li[1]/a/span");
	
	By links=By.tagName("a");
	By menu=By.tagName("nav");
	By addwishlist=By.xpath("//*[@id=\"main-collection-product-grid\"]/li[1]/div/div/div[1]/div/div[3]/div[1]");
	By clickcart=By.xpath("//*[@id=\"44199301382314\"]");
	By viewcart=By.xpath("//*[@id=\"halo-cart-sidebar\"]/div[2]/cart-coupon-discount/div/div[3]/div/div/a");
	By continueshopping=By.xpath("//*[@id=\"main-cart-items\"]/div/div[2]/form/div/div/a");
	
	//mouseover
	By ethnic=By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul/li[3]/a/span[1]");
	By kurthasets=By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul/li[3]/ul/li[2]/a/span");
	
	
public Pagejanasyaa (ChromeDriver driver)
{
	this.driver=driver;
	
}


public void newarrvial()
{
	driver.findElement(janasyanewarraival).click();
}
public void logopresent()

{
	if(driver.findElement(janasyalogo).isDisplayed())
	{
		System.out.println("logo is present");
	
}
	else
	{
		System.out.println("Logo is  not present");
	}
}
public void itemperpage()
{
	

	driver.findElement(item).click();
	driver.findElement(num).click();
	driver.navigate().refresh();
	
}

public void category()
{
	
	
	driver.findElement(categories).click();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(kurtha).click();


}


public void alllinks()
{
	List<WebElement>li=driver.findElements(links);
	for(WebElement link:li)
	{
		String s1=link.getAttribute("href");
		String s2= link.getText();
		
		System.out.println("links:"+s1+"----"+" Text "+s2);
	}
}

public void menus()
{
	List<WebElement>l=driver.findElements(menu);
	for(WebElement ele:l)
	{
	String s3=ele.getText();
	System.out.println("menu:" + s3);
	}}

public void wishlist()
{
	
	driver.findElement(addwishlist).click();
}
public void addcart()
{
	driver.findElement(clickcart).click();
}
public void viewcart()
{
	driver.findElement(viewcart).click();
	driver.navigate().to("https://janasya.com/cart");
}
public void continueshop()
{
	
	driver.findElement(continueshopping).click();
	
}
public void ethnics()
{
	Actions act=new Actions(driver);
	WebElement j=driver.findElement(ethnic);
	act.moveToElement(j).build().perform();
	driver.findElement(kurthasets);
	
	



}}
