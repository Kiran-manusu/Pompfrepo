package ppack;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepository.LoginPage;
import objectrepository.MyAccountPage;

public class LoginTest {
	
	WebDriver driver;
	
	@Test
	public void loginsTest() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
				
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\SELENIUM DATA\\Selenium data\\POMPFExample\\data.properties");
		prop.load(fis);
		String url = prop.getProperty("url");
		
		
		driver.get(url);
		
		LoginPage logpage = new LoginPage(driver);
		logpage.emailid().sendKeys("kiran123@gmail.com"); 
		logpage.password().sendKeys("G0p!K!6an");
		logpage.login().click();
		
		MyAccountPage accountpage = new MyAccountPage(driver);
		accountpage.mouseclick1().click();
		accountpage.myaccount().click();
		accountpage.mouseclick2().click();
		accountpage.logout().click();
		
	}
	@AfterMethod
	public void closepage() 
	{
		driver.close();
	}
	

}
