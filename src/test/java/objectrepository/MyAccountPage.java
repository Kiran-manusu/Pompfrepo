package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {
	
	WebDriver driver;
	
	public MyAccountPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	private By mouseclick1 = By.xpath("//div[@class='panel header']//button[@type='button']");
	private By mouseclick2 = By.xpath("//div[@class='panel header']//button[@type='button']");
	private By myaccount = By.xpath("//div[@aria-hidden='false']//a[normalize-space()='My Account']");
	private By logout = By.xpath("//div[@aria-hidden='false']//a[normalize-space()='Sign Out']");
	
	
	public WebElement mouseclick1() 
	{
		return driver.findElement(mouseclick1);
	}
	public WebElement myaccount() 
	{
		return driver.findElement(myaccount);
	}
	public WebElement mouseclick2() 
	{
		return driver.findElement(mouseclick2);
	}
	public WebElement logout() 
	{
		return driver.findElement(logout);
	}

}
