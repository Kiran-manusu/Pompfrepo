package objectrepository;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By emailid = By.id("email");
	private By password= By.id("pass");
	private By login = By.xpath("//button[@id='send2']");
	
	

	public WebElement emailid()
	{
		return driver.findElement(emailid);
	}
	
	public WebElement password() 
	{
		return driver.findElement(password);		
	}
	public WebElement login()
	{
		return driver.findElement(login);
	}
}
