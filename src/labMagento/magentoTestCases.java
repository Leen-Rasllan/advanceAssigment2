package labMagento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;



public class magentoTestCases extends prameters {

	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void setup() {
		driver.get(url);

	}

	@Test(priority = 1)
	public void CreatAnAcount()  {

		WebElement creatbouttun = driver.findElement(By.xpath(creatbouttunXpath));
		creatbouttun.click();

		WebElement firstname = driver.findElement(By.xpath(firstXpath));
		

		WebElement lastname = driver.findElement(By.xpath(lastXpath));

		WebElement email = driver.findElement(By.xpath(mailXpath));
		
		WebElement pasword = driver.findElement(By.xpath(paswordlXpath));
		
		WebElement confipasword = driver.findElement(By.xpath(confpaswordlXpath));

		
		firstname.sendKeys(randomFirstName);
		lastname.sendKeys(randomLastName);
		email.sendKeys(email_address);
		pasword.sendKeys(paswordnum);
		confipasword.sendKeys(paswordnum);
	
		WebElement donebouttun = driver.findElement(By.xpath(doneXpath));
		donebouttun.click();
		
		
		
		
	
		
		
		
		
		
		
	

	}
	
	
	

	
	
	
	@Test(priority = 2)
	public void logOut() throws InterruptedException {
		driver.get(logOutPage);//logOutPage
		
		
		
		Thread.sleep(7000) ;
		
		Check. assertEquals ( driver. getCurrentUrl ( ),url) ;
		Check.assertAll();
		
		
		}
	
	
	
	@Test(priority = 3)
	public void logIn() throws InterruptedException {
		
driver.get(signInUrl);
		
		//WebElement creatbouttun = driver.findElement(By.xpath(signInXpath));
		//creatbouttun.click();
		

		WebElement email = driver.findElement(By.id ("email"));
		WebElement pasword = driver.findElement(By.xpath(pasXpath));
		
		email.sendKeys(email_address);
		pasword.sendKeys(paswordnum); 
		

		WebElement donebouttun = driver.findElement(By.id("send2"));
		donebouttun.click();
		
		Thread.sleep(7000) ;
		
String welcomeMsg = driver.findElement(By.xpath("//div[@class='panel header']")).getText();
		
Check.assertEquals (welcomeMsg.contains("Welcome"),true ,"must contain 'Welcome'");
		
		Check.assertAll();
		}
	
	
	

	@AfterTest
	public void posttest() {
	}

}